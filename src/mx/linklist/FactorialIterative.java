package mx.linklist;

import java.util.Scanner;

public class FactorialIterative {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me the number you want to get teh factorial: ");
    int num = scanner.nextInt();

    int result = 1;

    for(int i = 1; i < num; i++) {
      result *= i;
    }

    System.out.printf("The factorial of %s is %s", num, result);
  }
}
