import java.util.*;

public class LongSet {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<>();
    for (short i = 0; i < 10000; i++) {
      s.add(i);
	  s.remove(i - 1);
    }
    System.out.println(s.size());
  }
}


