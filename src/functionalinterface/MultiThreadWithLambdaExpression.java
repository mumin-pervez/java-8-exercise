package functionalinterface;

public class MultiThreadWithLambdaExpression {

  public static void main(String[] args) {
    MyRunnable myRunnable = new MyRunnable();

    Runnable runnable = () -> {
      for (int i = 0; i < 10; i++) {
        System.out.println("Child Thread");
      }
    };
    Thread thread = new Thread(runnable);
    thread.start();
    for (int i = 1; i <= 10; i++) {
      System.out.println("Main Thread");
    }
  }
}
