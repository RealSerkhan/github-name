package HashMap.hash;

public class XHashMapApp {
  public static void main(String[] args) {
    XHashMap map = new XHashMap(128);
    map.put(1, "Alex");     // 1 % 128 = 1
    map.put(5, "Jim");
    map.put(133, "Jeremy");
    map.put(129, "Nikole"); // 129 % 128 = 1
    map.put(2, "Jeremy");
    map.put(130,"Real");

    System.out.println(map.get(1));
    System.out.println(map.get(2));
    System.out.println(map.get(129));
  }
}
