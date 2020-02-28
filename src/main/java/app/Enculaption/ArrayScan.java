package app.Enculaption;

import java.util.Random;
import java.util.Scanner;

public class ArrayScan {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        Random rand=new Random();
        int a=rs.nextInt();
        int[] arr=new int[a];


        int[] arr1 = new int[a];

        int[] arr2=new int[a];

        int[] ints = new int[3*a];
        for (int i=0;i<a;i++){
            int l=rand.nextInt(100);
            int d=rand.nextInt(100);
            int c=rand.nextInt(100);
            arr[i]=l;
            arr1[i]=d;
            arr2[i]=c;
        }
//        for (int k=0;k<a;k++){
//            int u=rand.nextInt(100);
//            arr1[k]=u;
//
//        }
//        for (int f=0;f<a;f++){
//            int v=rand.nextInt(100);
//            arr2[f]=v;
//            System.out.print(arr2[f]);
//        for (int el:arr){
//            System.out.print(el);
//        }
//        for (int r:arr){
//            System.out.print(r);
//        }
        int m=0;
        for (int j=0;j<a;j+=3){

            ints[j]=arr[j-m];
            ints[++j]=arr1[j=j-1-m];
            j++;
            ints[++j]=arr2[j=j-5];
            j=j+m-1;
            m=m+3;




        }
        for (int es: ints){
            System.out.print(es+" ");
        }




    }
}
