package AreaofDifferents;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner m = new Scanner(System.in);
        int a=m.nextInt();
        int b=m.nextInt();
        int c=m.nextInt();
        int d=m.nextInt();
        int e=m.nextInt();
        int h=m.nextInt();
        Points center=new Points(a,b);
        Points rectanglePoint1 = new Points(a,b );
        Points rectanglePoint2 = new Points(c,d );
        Points trianglepoint1=new Points(a,b);
        Points trianglepoint2=new Points(c,d);
        Points trianglepoint3=new Points(e,h);


        Rectangle rectangle = new Rectangle( rectanglePoint1,  rectanglePoint2);
        Triangle triangle = new Triangle(trianglepoint1,trianglepoint2,trianglepoint3);
        Circle circle=new Circle(center,b);



        ArrayList<Objects> list = new ArrayList<>();
        list.add(circle);
        list.add(rectangle);
        list.add(triangle);

    for ( Objects f: list) {
      System.out.println(f.area());
    }




    }
}
