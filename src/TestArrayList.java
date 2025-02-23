
public class TestArrayList {
  public static <T> int length(ArrayList<T> list) {
    int count = 0;
    if (!list.empty()) {
      list.findFirst();
      while (!list.last()) {
        count++;
        list.findNext();
      }
      count++;
    }

    return count;
  }

  public static <T> boolean find(ArrayList<T> list, T e) {
    if (!list.empty()) {
      list.findFirst();
      while (!list.last()) {
        if (list.retrieve().equals(e)) {
          return true;
        }
        list.findNext();
      }
      if (list.retrieve().equals(e))
        return true;
    }
    return false;
  }

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    ArrayList<String> list = new ArrayList(10);
    String S1 = "xyz", S2 = "abc";
    list.inset(S1);
    list.inset(S2);
    list.findFirst();
    System.out.println(list.retrieve());
    System.out.println(list.full());
    System.out.println(length(list));
    System.out.println("hello");
  }

}
