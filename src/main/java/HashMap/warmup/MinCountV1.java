package HashMap.warmup;

import java.util.*;
import java.util.stream.Collectors;

public class MinCountV1 {
  public static void main(String[] args) {
    int[] data_array = new Random()
        .ints(10, 26)
        .limit(50)
        .toArray();

    List<Integer> data = new Random()
        .ints(10, 26)
        .limit(50)
        .boxed()
        .collect(Collectors.toList());

    HashMap<Integer, Integer> rep = new HashMap<>();
    for (int num: data) {
      if (rep.containsKey(num)) {
        rep.put(num, rep.get(num) + 1);
      } else {
        rep.put(num, 1);
      }
    }
    int min_num = Integer.MAX_VALUE;
    int min_occ = Integer.MAX_VALUE;
    for(Map.Entry<Integer, Integer> ent: rep.entrySet()) {
      if (min_occ > ent.getValue()) {
        min_occ = ent.getValue();
        min_num = ent.getKey();
      }
    }
    for (Map.Entry<Integer,Integer>tst:rep.entrySet()){
      System.out.printf(" %d",tst.getKey());
    }
    System.out.println(data);
    System.out.println(rep);
    System.out.printf("num: %d occ: %d\n", min_num, min_occ);
  }
}
