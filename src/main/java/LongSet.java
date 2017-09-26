import java.util.*;

public class LongSet {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<>();
    for (short i = 0; i < 1000; i++) {
      short sh = i - 1;
      s.add(i);
      s.remove(sh);
    }
    System.out.println(s.size());
  }
}


