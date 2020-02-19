package app;

public class Cat extends Animal {
    String name;
    int year;
    public Cat(String name,int year){
        this.name=name;
        this.year=year;
    }
    @Override
    public String toString(){
        return String.format("My name is %s\ni am %d",name,year);
    }
}
