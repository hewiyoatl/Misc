package mx.linklist;

import java.util.Scanner;

public class EvenNumber {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give the number you want to validate: ");
    int a = scanner.nextInt();

    if((a & 1) == 1) {
      System.out.printf("The number %s is odd\n", a);
    }
    else {
      System.out.printf("The number %s is even\n", a);
    }


    // TODO: this do not belong here
    System.out.printf("This is the negative of 35: %s", ~35 + 1);
  }
}
