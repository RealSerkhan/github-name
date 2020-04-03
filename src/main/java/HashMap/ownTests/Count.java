package HashMap.ownTests;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Count {
    public static void main(String[] args) {
        int[] arr=new Random().ints(10,25).limit(50).toArray();
        List<Integer> arrl=new Random().ints(10,25).limit(50).boxed().collect(Collectors.toList());
        HashMap<Integer,Integer>rep=new HashMap<>();
        for (int num:arrl){
            if (rep.containsKey(num)){
                rep.put(num,rep.get(num)+1);
            }
            else rep.put(num,1);
        }
       int min_num=Integer.MAX_VALUE;
       int min_occ=Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> ent :rep.entrySet()){
            if (min_occ>ent.getValue()) {
                min_occ=ent.getValue();
                min_num=ent.getKey();
            }
        }
        System.out.println(arrl.toString());
        System.out.println(rep);
        System.out.printf("minimum number: %d " +
                "minimum occurness: %d",min_num,min_occ);


    }
}
