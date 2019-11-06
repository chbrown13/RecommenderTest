import java.util.*;

public class LongSet {
  public static void main (String[] args) {
    Set<Integer> s = new HashSet<Integer>();
    for (int i = 0; i < 100000; i++) {
	int sh = i - 1;
        s.add(i);
	s.remove(sh);
    }
    System.out.println(s.size());
  }
}


