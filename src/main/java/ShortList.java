import java.util.*;

public class ShortList {
  public static void main (String[] args) {
    List<Short> s = new ArrayList<Short>();
    for (short i = 0; i < 100; i++) {
      s.remove(i - 1);
    }
    System.out.println(s.size());
  }
}


