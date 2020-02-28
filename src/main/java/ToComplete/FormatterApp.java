package ToComplete;

public class FormatterApp {
  public static void print(String s, Formatter f) {
    System.out.println(f.changeApp(s));
  }


  public static void main(String[] args) {
    Formatter fmt1 = new Formatter1();
    Formatter fmt2 = new Formatter2();
    Formatter fmt3 = new Formatter3();

//    // task #1
//    fmt1.print("hello");    // hello
//    fmt2.print("hello");    // HELLO
//    fmt3.print("hello");    // ***********
//    // *  HELLO  *
//    // ***********

    // task #2
    print("hello", fmt1); // hello
    print("hello", fmt2); // HELLO
    print("hello", fmt3); // ***********
    // *  HELLO  *
    // ***********

//    // task #3
//    System.out.println(new Formatter1("hello")); // hello
//    System.out.println(new Formatter2("hello")); // HELLO
//    System.out.println(new Formatter3("hello")); // ***********
//    // *  HELLO  *
//    // ***********


  }

}
