package Testing;

import java.util.ArrayList;
import java.util.Objects;

public class Family {
    Human father;
    Human sun;
    public ArrayList<Human>humans=new ArrayList<>();

    public Family(Human father, Human sun) {
        this.father = father;
        this.sun = sun;
    }
    public void addChild(Human sun){
        humans.add(sun);

    }
    public boolean deleteChild(Human sun){

        humans.remove(sun);
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(father, family.father) &&
                Objects.equals(sun, family.sun) &&
                Objects.equals(humans, family.humans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, sun, humans);
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", sun=" + sun +
                '}';
    }
}
