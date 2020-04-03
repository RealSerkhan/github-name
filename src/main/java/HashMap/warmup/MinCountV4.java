package HashMap.warmup;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class MinCountV4 {
  public static void main(String[] args) {
    Map.Entry<Integer, Long> result = new Random()
        .ints(10, 26)
        .limit(50)
        .boxed()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
        .entrySet().stream().min((o1, o2) -> {
          return (int) (o1.getValue() - o2.getValue()); //1 , INT.MAX + 2
        }).orElseThrow(RuntimeException::new);

    System.out.printf("num: %d occ: %d\n", result.getKey(), result.getValue());
  }
}
