import java.util.*;

public class ShortSet {
  public static void main (String[] args) {
    int a;
    int b;
    int c;
    int d;
    int e;
    Set<Short> s = new HashSet<Short>();
    for (short i = 0; i < 100; i++) {
      short sh = i - 1;
      s.remove(sh);
    }
    System.out.println(s.size());
    boolean b = false;
  }
}


