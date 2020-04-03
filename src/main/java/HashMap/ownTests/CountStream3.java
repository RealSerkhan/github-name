package HashMap.ownTests;

import java.util.*;
import java.util.stream.Collectors;

public class CountStream3 {
    public static void main(String[] args) {
        int[] arr=new Random().ints(10,25).limit(50).toArray();
        List<Integer> arrl=new Random().ints(10,25).limit(50).boxed().collect(Collectors.toList());
        Map.Entry<Integer, List<Integer>> rep=new Random().ints(10,25).limit(20).boxed().collect(Collectors.groupingBy(i->i)).entrySet()
                .stream()
                .min(new Comparator<Map.Entry<Integer, List<Integer>>>() {
                    @Override
                    public int compare(Map.Entry<Integer, List<Integer>> integerListEntry, Map.Entry<Integer, List<Integer>> t1) {
                        return integerListEntry.getValue().size()-t1.getValue().size();
                    }
                }).orElseThrow(RuntimeException::new);
        System.out.printf("minimum number: %d\n" +
                "minimum occurness: %d",rep.getKey(),rep.getValue().size());


    }
}
