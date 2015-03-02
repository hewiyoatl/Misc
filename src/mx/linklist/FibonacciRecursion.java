package mx.linklist;

public class FibonacciRecursion {
  public static void main(String[] args) {
    Integer number = new Integer(args[0]);

    for(int i = 1; i <= number; i++) {
      System.out.printf("%s ", fibonacci(i));
    }
  }

  public static int fibonacci(int value) {
    if(value == 1 || value == 2) {
      return 1;
    }

    return fibonacci(value - 1) + fibonacci(value - 2);
  }
}
