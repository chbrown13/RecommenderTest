import java.util.*;

public class ShortSet {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<Short>();
    for (short i = 0; i < 100; i++) {
      short st = i - 1;
      s.add(i);
      s.remove(st);
    }
    System.out.println(s.size());
  }
}


