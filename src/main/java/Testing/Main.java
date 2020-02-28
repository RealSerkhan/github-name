package Testing;

public class Main {
    public static void main(String[] args) {
        Human Hilal=new Human("Hilal","Serkhan",1997);
        Human father=new Human("Father","Serkhan",1971);
        Family family=new Family(father,Hilal);
        System.out.println(father.toString());
        System.out.println(family.deleteChild(Hilal));
        family.addChild(Hilal);

    }
}
