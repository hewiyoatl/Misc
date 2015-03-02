package mx.linklist;

import java.util.Scanner;

public class SumWithoutOperator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give the first number: ");
    int a = scanner.nextInt();
    System.out.print("Give the second number: ");
    int b = scanner.nextInt();

    System.out.printf("a is %s and b is %s\n", a, b);

    a = a ^ b;
    b = a ^ b;
    a = a ^ b;

    System.out.printf("After the swap. a is %s and b is %s", a, b);
  }
}
