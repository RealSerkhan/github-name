package HashMap.warmup;

import java.util.*;
import java.util.stream.Collectors;

public class MinCountV2 {
  public static void main(String[] args) {
    List<Integer> data = new Random()
        .ints(10, 26)
        .limit(50)
        .boxed()
        .collect(Collectors.toList());

    HashMap<Integer, Integer> rep = new HashMap<>();
    for (Integer x : data) {
      rep.merge(x, 1, (a, b) -> Integer.sum(a, b));
    }

    // finding minimal
    Map.Entry<Integer, Integer> result = rep.entrySet().stream().min(new Comparator<Map.Entry<Integer, Integer>>() {
      @Override
      public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
        return o1.getValue() - o2.getValue();
      }
    }).orElseThrow(RuntimeException::new);

    System.out.println(data);
    System.out.println(rep);
    System.out.printf("num: %d occ: %d\n", result.getKey(), result.getValue());
  }
}
