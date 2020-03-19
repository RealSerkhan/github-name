package DAO;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class DAOStudentFileBin implements DAO<Student> {

  private File file;

  public DAOStudentFileBin(String filename) {
    this.file = new File(filename);
  }

  @Override
  public Collection<Student> getAll() {
    try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
      Object readed = ois.readObject();
      List<Student> students = (ArrayList<Student>) readed;
      return students;
    } catch (IOException | ClassNotFoundException ex) {
      return new ArrayList<>();
    }
  }

  @Override
  public Optional<Student> get(int id) {
    for (Student s : getAll()) {
      if (s.id == id) {
        return Optional.of(s);
      }
    }
    return Optional.empty();
  }

  @Override
  public Collection<Student> getAllBy(Predicate<Student> p) {
    List<Student> list = new ArrayList<>();
    for (Student student : getAll()) {
      if (p.test(student)) {
        list.add(student);
      }
    }
    return list;
  }

  @Override
  public void create(Student student) {
    Collection<Student> students = getAll();
    students.add(student);
    write(students);
  }

  @Override
  public void delete(int id) {
    Collection<Student> students = getAllBy(s -> s.id != id);
    write(students);
  }

  private void write(Collection<Student> students) {
    try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
      oos.writeObject(students);
    } catch (IOException ex) {
      throw new RuntimeException("DAO:write:IOException", ex);
    }
  }

}
