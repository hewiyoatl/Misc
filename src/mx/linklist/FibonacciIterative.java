package mx.linklist;

public class FibonacciIterative {
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

    int fib1 = 1, fib2 = 1, fibonacci = 1;

    for(int i = 3; i <= value; i ++) {
      fibonacci = fib1 + fib2;
      fib1 = fib2;
      fib2 = fibonacci;
    }

    return fibonacci;
  }
}
