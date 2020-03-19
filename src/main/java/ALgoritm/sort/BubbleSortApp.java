package ALgoritm.sort;

import java.util.Arrays;
import java.util.Random;

public class BubbleSortApp {
  // ArrayList.get(i)  - O(1)
  // LinkedList.get(i) - O(N)
  // big O notation
  // complexity
  // O(1)         - fastest one
  // O(logN)
  // O(N)
  // O(N logN)
  // O(N^2) initially
  // O(N^2 / 2) after optimization

  // O(N!)
  // O(N^N)       - the worst one
  // O(N^N^N)
  public static void main(String[] args) {
    int[] data = new Random().ints(10, 30).limit(20).toArray();
    System.out.println(Arrays.toString(data));
    for (int i = 0; i < data.length; i++) {
      for (int j = i+1; j < data.length; j++) {
        if (data[j] < data[i]) {
          int t = data[i];
          data[i] = data[j];
          data[j] = t;
        }
      }
    }
    System.out.println(Arrays.toString(data));
  }
}
