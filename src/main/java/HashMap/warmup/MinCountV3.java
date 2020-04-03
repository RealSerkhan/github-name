package HashMap.warmup;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MinCountV3 {
  public static void main(String[] args) {
    Map<Integer, List<Integer>> rep2 = new Random()
        .ints(10, 26)
        .limit(50)
        .boxed()
        .collect(Collectors.groupingBy(Function.identity()));

    Map<Integer, Long> rep = new Random()
        .ints(10, 26)
        .limit(50)
        .boxed()
        .collect(Collectors.groupingBy(i -> i,
            Collectors.counting()
        ));

    // finding minimal
    Map.Entry<Integer, Long> result = rep.entrySet().stream().min(new Comparator<Map.Entry<Integer, Long>>() {
      @Override
      public int compare(Map.Entry<Integer, Long> o1, Map.Entry<Integer, Long> o2) {
        return (int) (o1.getValue() - o2.getValue()); //1 , INT.MAX + 2
      }
    }).orElseThrow(RuntimeException::new);
    Map.Entry<Integer,List<Integer>>result2=rep2.entrySet().stream().min(new Comparator<Map.Entry<Integer, List<Integer>>>() {
      @Override
      public int compare(Map.Entry<Integer, List<Integer>> integerListEntry, Map.Entry<Integer, List<Integer>> t1) {
        return integerListEntry.getValue().size()-t1.getValue().size();
      }
    }).orElseThrow(RuntimeException::new);
    System.out.println(rep);
    System.out.println(rep2);
    System.out.printf("num: %d occ: %d\n", result.getKey(), result.getValue());
    System.out.printf("num: %d occ: %d\n", result2.getKey(), result.getValue());
  }
}
