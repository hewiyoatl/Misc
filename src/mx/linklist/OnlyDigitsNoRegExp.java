package mx.linklist;

import java.util.Scanner;

public class OnlyDigitsNoRegExp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("String to validate: ");

    String stringToValidate = scanner.nextLine();

    boolean hasOnlyDigits = true;
    for(Character c : stringToValidate.toCharArray()) {
      if(c < '0' || c > '9') {
        hasOnlyDigits = false;
        break;
      }
    }

    if(hasOnlyDigits) {
      System.out.printf("The string \"%s\" has only digits", stringToValidate);
    }
    else {
      System.out.printf("The string \"%s\" is alphanumeric", stringToValidate);
    }
  }
}
