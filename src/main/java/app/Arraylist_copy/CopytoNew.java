package app.Arraylist_copy;

import java.util.ArrayList;
import java.util.List;

public  class CopytoNew {


        public List<Integer> finals(List<Integer> array1, List<Integer> array2){
//             = new ArrayList<>();
//
//            ArrayList<Integer> array2 = new ArrayList<>();


//            System.out.println(array1);
//            System.out.println(array2);


            List<Integer> listTwoCopy = new ArrayList<>(array2);
            listTwoCopy.removeAll(array1);
            array1.addAll(listTwoCopy);

            return array1;
        }
    }




