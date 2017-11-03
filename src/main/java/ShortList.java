import java.util.*;

public class ShortList {
  public static void main (String[] args) {
    List<Short> s = new ArrayList<Short>();
    for (short i = 0; i < 100; i++) {
      Short sh = i - 1;
      s.remove(sh);
    }
    System.out.println(s.size());
  }
}


