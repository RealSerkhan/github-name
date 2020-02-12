package app;

import java.util.Random;

public class Task1 {

        public static void main(String[] args) {
            Random rand=new Random();
            int[] arr=new int[30];
            int d=0;
            for (int i=0;i<30;){

                int b = rand.nextInt(20 - (-20)) + (-20);
                if(b%2==0){

                    continue;
                }
                else {
                    arr[i]=b;
                    i++;
                }

                d+=b;


            }

            for(int element: arr){
                System.out.print(element+", ");}
            System.out.println("total sum of even numbers: "+d);

            int[] arr1=new int[30];
            int f=0;
            Random rand1=new Random();
            for(int j=0;j<30;){
                int c=rand1.nextInt(30 - (-30)) + (-30);
                if(c%2!=0){

                    continue;
                }
                else{
                    arr1[j]=c;

                    j++; }
                f+=c;


                System.out.print(arr1[j-1]+", ");

            }
            int sum=f+d;
            System.out.println("total sum of odd is: "+ f);

            System.out.println("total sum is: "+sum);

        }
    }

