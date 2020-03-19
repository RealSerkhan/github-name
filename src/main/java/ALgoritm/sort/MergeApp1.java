package ALgoritm.sort;

import java.util.Arrays;
import java.util.Random;

public class MergeApp1 {
  public static void main(String[] args) {
    int[] data1 = new Random().ints(10, 30).limit(10).sorted().toArray();
    int[] data2 = new Random().ints(10, 30).limit(10).sorted().toArray();
    int[] data3 = merge(data1, data2);
    System.out.println(Arrays.toString(data1));
    System.out.println(Arrays.toString(data2));
    System.out.println(Arrays.toString(data3));
  }

  private static int[] merge(int[] data1, int[] data2) {
    int[] data3 = new int[data1.length + data2.length];
    int idx1 = 0;
    int idx2 = 0;
    int idx3 = 0;

    while (idx1 < data1.length && idx2 < data2.length) {
      if (data1[idx1] < data2[idx2]) data3[idx3++] = data1[idx1++];
      else data3[idx3++] = data2[idx2++];
    }
    while (idx1 < data1.length) {
      data3[idx3++] = data1[idx1++];
    }
    while (idx2 < data2.length) {
      data3[idx3++] = data2[idx2++];
    }

    return data3;
  }
}
