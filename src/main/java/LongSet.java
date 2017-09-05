public class LongSet {
  public static void main (String[] args) {
    Set<Short> s = new HashSet<>();
    for (short i = 0; i < 1000; i++) {
      s.add(i);
    }
    System.out.println(s.size());
  }
}


