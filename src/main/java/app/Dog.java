package app;

public class Dog extends Animal {
    String name;
    int year;
    public Dog(String name,int year){
        this.name=name;
        this.year=year;
    }
//    void print(){
//
//        System.out.println(Show());
//    }
public String toString(){
        return String.format("My name is %s\ni am %d",name,year);
    }

}
