package comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorUsingLambdaExpression {

  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(78);
    list.add(93);
    list.add(45);
    list.add(64);
    list.add(34);
    System.out.println("Without soring order");
    System.out.println(list);

    System.out.println("Sorted Data");
    // Comparator is a functional interface
    Comparator<Integer> com = (i1, i2) -> (i1 > i2) ? +1 : (i1 < i2) ? -1 : 0;
    Collections.sort(list, com);
    System.out.println(list);
  }

}
