package app.Enculaption;

import java.util.Arrays;
import java.util.Scanner;

public class Envelope {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int a=scan.nextInt();
        int b=scan.nextInt();
        double k=((double)b)/a;


        String[][] arr=new String[a][b];


        for(int i=0;i<a;i++){

            for(int j=0;j<b;j++){
                if(j==0 || j==b-1 ||i==a-1 ||i==0 ||j==i*k||b-j-1==i*k){
                System.out.print("*");}
                else{
                System.out.print(" ");}

            }
            System.out.println();

        }
        }
    }

