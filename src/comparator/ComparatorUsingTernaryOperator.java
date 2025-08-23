package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class OurComparator implements Comparator<Integer> {

  @Override
  public int compare(Integer i1, Integer i2) {
    // For increasing order sorted
    return (i1 > i2) ? +1 : (i1 < i2) ? -1 : 0;

    // For decreasing order
    // return (i1 > i2) ? -1 : (i1 < i2) ? +1 : 0;

/*    if (i1 > i2) {
      return +1;
    } else if (i1 < i2) {
      return -1;
    } else {
      return 0;
    }*/

  }
}

public class ComparatorUsingTernaryOperator {

  public static void main(String[] args) {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(16);
    al.add(8);
    al.add(3);
    al.add(28);
    al.add(14);
    System.out.println(al);
    System.out.println("Sort the listed value using compare() method");
    Collections.sort(al, new OurComparator());
    System.out.println(al);
  }

}
