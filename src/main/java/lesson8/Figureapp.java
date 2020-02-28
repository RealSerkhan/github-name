package lesson8;

import java.util.ArrayList;
import java.util.Random;

public class Figureapp {
    public static void main(String[] args) {
        int i=0;

        Random rand=new Random();
        while (i<10)
        while( i<10){int which=rand.nextInt(4);
        int a=rand.nextInt(10);
        int b=rand.nextInt(10);
        int c=rand.nextInt(10);
        int d=rand.nextInt(10);
        int e=rand.nextInt(10);
        int f=rand.nextInt(10);


        switch (which){
            case 1: Triangle tr = new Triangle(new Point(a,b), new Point(c,d), new Point(e,f));
                System.out.println("Area of Triangle "+ tr.area());
                i++;
               continue;
            case 2: Rectangle rt = new Rectangle(new Point(a,b), new Point(c,d));
                System.out.println("Area of Rectangle "+rt.area());
                i++;
                continue;
            case 3: Circle cr = new Circle(new Point(a,b),c);
                System.out.println("Area of Circle "+cr.area());
                i++;
                continue;

        }

//        ArrayList<Figure> figures = new ArrayList<>();
//        figures.add(tr);
//        figures.add(rt);
//        figures.add(cr);
//        int total = 0;
//        for (Figure f: figures) {
//            total += f.area();
//
//        }
//        System.out.printf("The total area is %d\n", total);
    }
}}
