package mx.linklist;

import java.util.Scanner;

public class PalindromeNumber {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a number to test: ");
    Integer number = scanner.nextInt();
    Integer reverse = 0;
    Integer realNumber = number;

    while(number != 0) {
      reverse = reverse * 10 + number % 10;
      number = number / 10;
    }

    if(reverse == realNumber) {
      System.out.printf("The number %s is palindrome\n", realNumber);
    } else {
      System.out.printf("The number %s is NOT palindrome\n", realNumber);
    }
  }
}
