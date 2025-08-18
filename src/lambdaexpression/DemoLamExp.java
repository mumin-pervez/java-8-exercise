package lambdaexpression;

interface Interf {

  public void add(int a, int b);
}

class myInterfImpClass implements Interf {

  @Override
  public void add(int a, int b) {
    System.out.println("Addition of " + a + " and " + b + " is : " + (a + b));
  }
}

public class DemoLamExp {

  public static void main(String[] args) {
    Interf interf = new myInterfImpClass();
    interf.add(10, 15);
// Now we are using functional interface and lambda expression
    Interf interf1 = (a, b) -> System.out.println(
        "Addition of " + a + " and " + b + " is : " + (a + b));
    interf1.add(5, 10);
    interf1.add(50, 17);

  }

}
