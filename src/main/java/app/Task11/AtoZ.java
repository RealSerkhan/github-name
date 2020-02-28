package app.Task11;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;

public class AtoZ {








    public static void main(String[] args) {
        AtoZ m=new AtoZ();
        System.out.println(m.Sorting("hello"));

    }
    public  Set Sorting(String orign){
//        orign="Hello";
       String x=orign.toLowerCase();
        TreeSet rs=new TreeSet();
        ArrayList all=new ArrayList();
        for (int i = 0; i <orign.length() ; i++) {
            all.add(orign.charAt(i));

        }
        for (int i = 0; i <orign.length() ; i++) {
            rs.add(x.charAt(i));
        }
        int c=0;
        for (int i = 0; i <orign.length() ; i++) {
            if(rs.first().equals(all.indexOf(i))){
                TreeSet b= (TreeSet) rs.first();
                rs.remove(b);
              
                i=i-i;

            }


        }


       return  rs;
    }

}
