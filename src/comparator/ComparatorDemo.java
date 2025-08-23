package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer obj1, Integer obj2) {
    if (obj1 > obj2) {
      return +1;
    } else if (obj1 < obj2) {
      return -1;
    } else {
      return 0;
    }
  }
}

public class ComparatorDemo {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(35);
    al.add(20);
    al.add(5);
    al.add(27);
    al.add(36);
    al.add(18);
    System.out.println(al);
    System.out.println("Now using sorting order");
    Collections.sort(al, new MyComparator());
    System.out.println(al);
  }
}
