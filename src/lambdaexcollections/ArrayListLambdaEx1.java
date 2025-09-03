package lambdaexcollections;

import java.util.Arrays;
import java.util.List;

public class ArrayListLambdaEx1 {

  public static void main(String[] args) {
    List<String> nameList = Arrays.asList("Anik", "Kundu", "Bashir", "Moyeen");
    System.out.println("Retrieving list data by using for loop");
    for (String name : nameList) {
      System.out.println(name);
    }

    System.out.println("By using forEach() method with Lambda Expression");
    nameList.forEach((name) -> System.out.println(name));
  }

}
