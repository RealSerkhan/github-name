package app;

import java.util.Arrays;
import java.util.Scanner;

public class Again {
    public static void main(String[] args) {
        Scanner rs = new Scanner(System.in);
        int a = rs.nextInt();
        int[] arr1 = new int[a];
        int[] arr2 = new int[a];
        int[] arr3 = new int[a];
        for (int i = 0; i < a; i++) {
            arr1[i] = (int) (Math.random()*(100+1))*2;
            arr2[i] = (int) (Math.random()*(100+1))*7;
            arr3[i] = (int) (Math.random()*(100+1))*11;
        }
        //int indexForFirstArrays=0;
        int[] finals = new int[3 * a];
        for (int i = 0; i < a; i++) {
            finals[i*3] = arr1[i];
            finals[i*3+1] = arr2[i];
            finals[i*3+2] = arr3[i];
        }
        System.out.printf("arr1: %s\narr2: %s\narr3: %s\n finals: %s\n",
                Arrays.toString(arr1),
                Arrays.toString(arr2),
                Arrays.toString(arr3),
                Arrays.toString(finals));

    }
}

