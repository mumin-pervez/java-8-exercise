package filtermethod;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectingListCount {

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(2, 9, 5, 3, 9, 8);

    System.out.println("Total elements in the list");
    numbers.forEach(number -> System.out.print(number + " "));

    System.out.println("\nFilter then collect the list");
    numbers.stream().filter(i -> i % 2 == 0).forEach(num -> System.out.println(num));

    System.out.println("After collected even data from the list");
    List<Integer> collectedData = numbers.stream().filter(i -> i % 2 == 0)
        .collect(Collectors.toList());
    System.out.println(collectedData);

    System.out.println("After collected even data then show the count");
    long count = numbers.stream().filter(j -> j % 2 == 0).collect(Collectors.toList()).stream()
        .count();
    System.out.println(count);

  }
}
