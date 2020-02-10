package app;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner rs=new Scanner(System.in);
        System.out.println("please input numbers");
        int a=rs.nextInt();
        int b=rs.nextInt();
        int c=a+b;
        System.out.println(c);
    }
}
