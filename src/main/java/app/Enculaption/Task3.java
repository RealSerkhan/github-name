package app.Enculaption;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random rand=new Random();
        int[] arr = new int[10];
        int c=0;
        int s=0;
        int f=0;
        int o=0;
        System.out.print("First array: ");

        for (int i=0;i<10;i++){
            int a=rand.nextInt(10-(-10))+(-10);
            arr[i]=a;

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("Negatives: ");
        for (int element:arr){
            if(element<0){
                c++;
                System.out.print(element+" ");
            }
        }
        System.out.println();
        System.out.print("Shifted form: ");
        int[] neg = new int[c];
        for (int j=0;j<10;j++){
            if(arr[j]<0){
                neg[s]=arr[j];
                s++;
            }
        }
        while(o<10 && f<c){
            try{

                    if(arr[o]==neg[f]){
                        arr[o]=neg[f-1];
                        f++;
                    }
                    o++;

                }
            catch (ArrayIndexOutOfBoundsException e){
                arr[o]=neg[c-1];
                o++;
                f++;
            }

            }

        for (int say: arr){
            System.out.print(say+" ");
        }

    }
}
