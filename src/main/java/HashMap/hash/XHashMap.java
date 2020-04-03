package HashMap.hash;

public class XHashMap {

  private final int size;
  private final int[] k;
  private final String[] v;

  public XHashMap(int size) {
    this.size = size;
    this.k = new int[size];
    this.v = new String[size];
  }

  public void put(int key, String data) {
    int idx = index(key);
    if (k[idx] !=0) {
      idx++;
    }
    k[idx] = key;
    v[idx] = data;
  }

  private int index(int key) {
    return key % size;
  }

  public String get(int key) {
    int idx = index(key);
    if (k[idx]!=key) {
      idx++;
    }
    return v[idx];
  }
}
