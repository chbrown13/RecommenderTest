import java.util.*;

public class ShortSet {
  public static void main (String[] args) {
    int a = 0;
    int b = 1;
    short c = 2;
    Set<Short> s = new HashSet<Short>();
    for (short i = 0; i < 100; i++) {
      short sh = i - 1;
      s.add(i);
      s.remove(sh);
    }
    System.out.println(s.size());
  }
}


