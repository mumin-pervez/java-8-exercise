package functionalinterface;

interface FuncInterface {

  // An abstract function
  void abstractMethod(int x);

  // A non-abstract default method/function
  default void defaultMethod() {
    System.out.println("Default Method from functional interface");
  }

}

public class FunctionalInterfaceWithLambda {

  public static void main(String[] args) {
    //Lambda expression to implement above functional interface
    FuncInterface fi = (x) -> System.out.println(2 * x);
    fi.abstractMethod(5);

  }

}
