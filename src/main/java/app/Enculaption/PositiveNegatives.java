package app.Enculaption;

import java.util.Arrays;
import java.util.Random;

public class PositiveNegatives {
    public static void main(String[] args) {
        Random rand=new Random();
        int[][] arr= new int[2][40];
        for (int i=0;i<2;i++){

            for(int j=0;j<40;j++){

                int a=rand.nextInt(100-(-100))+(-100);
            if (a<0){j=j+1;
                arr[0][j-1]=rand.nextInt(100-(-100))+(-100);
                j=j-1;



            }
            else{ j+=1;
                arr[1][j-1]=a;


            }



        }}
        for (int[] row : arr){
            System.out.println(Arrays.toString(row));
        }
    }
}
