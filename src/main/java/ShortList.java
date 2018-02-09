import java.util.*;

public class ShortList {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<Short>();
    for (short i = 0; i < 100; i++) {
      short fix = i - 1;
      s.add(i);
      s.remove(fix);
    }
    System.out.println(s.size());
  }
}
