package filtermethod;

import java.util.Set;
import java.util.stream.Collectors;

public class CollectingSetData {

  public static void main(String[] args) {
    Set<Integer> numberSet = Set.of(14, 17, 19, 12);
    System.out.println(numberSet);
    System.out.println("Printing set element using forEach() method");
    numberSet.forEach(num -> System.out.println(num));

    System.out.println("Filter even data :: Collect as Set ");
    Set set = numberSet.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
    System.out.println(set);
  }

}
