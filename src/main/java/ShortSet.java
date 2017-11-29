import java.util.*;

public class ShortSet {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<Short>();
    for (short it = 0; it < 100; it++) {
      s.add(it);
      s.remove(it - 1);
    }
    System.out.println(s.size());
  }
}


