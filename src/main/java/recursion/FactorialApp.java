package recursion;

public class FactorialApp {


  static int fact (int N, int index) {
    if (N == index) return 1;
    int partialFact = fact(N-1, index);
    return N * partialFact;
  }

  static int fact( int N) {
    return fact(N, 0);
  }


  public static void main(String[] args) {
    int N = 5;
    int f5 = fact(N);
    System.out.printf("Factorial: %d\n", f5);
  }

}
