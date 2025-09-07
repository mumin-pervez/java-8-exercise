package filtermethod;

import java.util.Arrays;
import java.util.List;

public class FilterMethodEx1 {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(2, 7, 4, 5, 7);
    System.out.println("Print the total elements in the list");
    numbers.forEach(number -> System.out.println(number));

    System.out.println("Even number from the list");
    numbers.stream().filter(i -> i % 2 == 0).forEach(number -> System.out.println(number));

    System.out.println("Odd numbers from the list");
    numbers.stream().filter(i -> i % 2 != 0).forEach(number -> System.out.println(number));
  }

}
