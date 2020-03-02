package Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        String islem = rs.nextLine();
        int b;
        int c = Integer.parseInt(String.valueOf(islem.charAt(0)));
        int d = Integer.parseInt(String.valueOf(islem.charAt(2)));
        char f = islem.charAt(1);

        switch (f) {
            case '+':
                b = c + d;
                System.out.println(b);
                break;
            case '-':
                b = c - d;
                System.out.println(b);
                break;
            case '*':
                b = c * d;
                System.out.println(b);
                break;
            case '/':
                b = c / d;
                System.out.println(b);
                break;
        }


    }
}
