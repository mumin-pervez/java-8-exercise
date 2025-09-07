package filtermethod;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingListData {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(2, 7, 8, 5, 7, 8);

    //Print all elements in the list using forEach() method
    System.out.println("Print all elements in the list using forEach() method");
    numbers.forEach(num -> System.out.print(" " + num));

    System.out.println("\nFilter even number :: Collect as List ");
    List<Integer> evenNumbers = numbers.stream().filter(num -> num % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(evenNumbers);

    System.out.println("\nFilter even number :: Collect as Set ");
    Set<Integer> evenNumberSet = numbers.stream().filter(num -> num % 2 == 0)
        .collect(Collectors.toSet());
    System.out.println(evenNumberSet);

    System.out.println("Filter odd data :: Collect as Set");
    Set<Integer> set = numbers.stream().filter(i -> i % 2 != 0).collect(Collectors.toSet());
    System.out.println(set);

  }

}
