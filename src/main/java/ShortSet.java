import java.util.*;

public class ShortSet {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<Short>();
    for (short i = 0; i < 100; i++) {
        short s = i - 1;
        s.remove(s);
        s.add(i);
    }
    System.out.println(s.size());
  }
}

