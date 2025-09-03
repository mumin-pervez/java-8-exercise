package lambdaexpression;

@FunctionalInterface
interface AddOperation {

  void addTwoNumbers(int num1, int num2);
}

public class LambdaEx2 {

  public static void main(String[] args) {
    AddOperation ao1 = (int num1, int num2) -> System.out.println(
        "Addition of " + num1 + " and " + num2 + " is " + (num1 + num2));
    ao1.addTwoNumbers(10, 15);
    ao1.addTwoNumbers(15, 55);
  }

}
/*
Output:
Addition of 10 and 15 is 25
Addition of 15 and 55 is 70*/
