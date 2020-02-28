package app.Enculaption;

import java.util.Objects;

public class Dog extends Animal {
//    String name;
    int year;
    public Dog(String name,int year){
        super(name);
        this.year=year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return year == dog.year;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year);
    }




public String toString(){
        return String.format("My name is %s\ni am %d old",name,year);
    }
}
