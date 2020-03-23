package recursion;

public class FactorialApp {


  static int fact (int N, int index) {
    if (N == 0) return 1;
    int partialFact = fact(N, index-1);
    return N + partialFact;
  }

  static int fact( int N) {
    int a=N;
    return fact(N, N);
  }


  public static void main(String[] args) {
    int N = 5;
    int f5 = fact(N);
    System.out.printf("Factorial: %d\n", f5);
  }

}
