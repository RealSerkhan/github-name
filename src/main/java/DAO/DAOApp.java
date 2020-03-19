package DAO;

public class DAOApp {
  public static void main(String[] args) {
    DAO<Student> dao =
//        new DAOStudentMemory();
//        new DAOStudentFileText("students.txt");
        new DAOStudentFileBin("students.bin");

    dao.create(new Student(1,"Jim", 25));
    dao.create(new Student(2,"Jack", 26));
    dao.create(new Student(3,"Jeremy", 27));

    System.out.println("----");
    for (Student student : dao.getAll()) {
      System.out.println(student);
    }
    System.out.println("----");
    dao.create(new Student(4,"Jackson", 31));
    dao.getAll().stream().forEach(System.out::println);
    System.out.println("----");
    dao.delete(2);
    dao.getAll().stream().forEach(System.out::println);
    System.out.println("----");
    String s4 = dao.get(4).map(Student::represent).orElse("No student found");
    String s5 = dao.get(5).map(Student::represent).orElse("No student found");
    System.out.println(s4);
    System.out.println(s5);
  }
}
