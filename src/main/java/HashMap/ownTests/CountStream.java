package HashMap.ownTests;

import java.util.*;
import java.util.stream.Collectors;

public class CountStream {
    public static void main(String[] args) {
        int[] arr=new Random().ints(10,25).limit(50).toArray();
        List<Integer> arrl=new Random().ints(10,25).limit(50).boxed().collect(Collectors.toList());
        HashMap<Integer,Integer>rep=new HashMap<>();
//        for (int num:arrl){
//            if (rep.containsKey(num)){
//                rep.put(num,rep.get(num)+1);
//            }
//            else rep.put(num,1);
//        }
        arrl.stream().forEach(x->rep.merge(x,1,Integer::sum));

        Map.Entry<Integer, Integer> result = rep.entrySet().stream().min(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> integerIntegerEntry, Map.Entry<Integer, Integer> t1) {
                return integerIntegerEntry.getValue() - t1.getValue();
            }
        }).orElseThrow(RuntimeException::new);
        System.out.println(arrl.toString());
        System.out.println(rep);
        System.out.printf("minimum number: %d\n" +
                "minimum occurness: %d",result.getKey(),result.getValue());


    }
}
