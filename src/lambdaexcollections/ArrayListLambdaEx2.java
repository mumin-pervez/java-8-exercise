package lambdaexcollections;

import java.util.Arrays;
import java.util.List;

public class ArrayListLambdaEx2 {

  public static void main(String[] args) {
    List<Integer> rollNo = Arrays.asList(1, 2, 5, 3);
    rollNo.forEach((roll) -> System.out.println(roll));

    List<String> names = Arrays.asList("Mumin", "Anik", "Sabbir");
    for (String name : names) {
      System.out.println(name);
    }
    System.out.println("Using forEach() method");
    names.forEach((name) -> System.out.println(name));
  }

}
