package app.Arraylist_copy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public  class CopytoNew {


        public static void main(String[] args) throws Exception
        {
            ArrayList<Integer> array1 = new ArrayList<>();

            ArrayList<Integer> array2 = new ArrayList<>();
            for (int i = 0; i <5 ; i++) {
                array1.add(i);

            }
            for (int i = 1; i <7 ; i++) {
                array2.add(i);

            }
            System.out.println(array1);
            System.out.println(array2);


            List<Integer> listTwoCopy = new ArrayList<>(array2);
            listTwoCopy.removeAll(array1);
            array1.addAll(listTwoCopy);

            System.out.println(array1);
        }
    }




