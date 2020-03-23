package recursion;

public class sumApp {

  static int sum (int n, int index) {
    if (n == index) return 0;
    int partialSum = sum(n, index+1);
    return n+partialSum;
  }

  static int sum (int n) {
    return sum(n, 0);
  }

  public static void main(String[] args) {
    int N = 6;
    int f5 = sum(N);
    System.out.printf("sum: %d\n", f5);
  }

}
