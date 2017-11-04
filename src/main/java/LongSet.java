import java.util.*;

public class LongSet {
  public static void main (String[] args) {
    Set<Integer> s = new HashSet<Integer>();
    for (int i = 0; i < 1000; i++) {
        s.add(i);
	s.remove(i - 1);
    }
    System.out.println(s.size());
  }
}


