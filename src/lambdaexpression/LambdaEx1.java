package lambdaexpression;

@FunctionalInterface
interface Greeting {

  // Only one abstract method is for the functional interface
  void greet();

}

public class LambdaEx1 {

  public static void main(String[] args) {
    // Lambda expression: we are providing the implementation of functional interface method
    Greeting g1 = () -> System.out.println("Welcome");
    g1.greet();

    Greeting g2 = () -> {
      System.out.println("Have a great journey");
      System.out.println("Best of luck");
    };
    g2.greet();

  }
}

/*Output
======
Welcome
Have a great journey
Best of luck*/
