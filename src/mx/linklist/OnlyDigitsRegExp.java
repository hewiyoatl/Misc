package mx.linklist;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OnlyDigitsRegExp {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Pattern p = Pattern.compile("^\\d*$");

    System.out.print("String to validate: ");

    String stringToValidate = scanner.nextLine();

    Matcher m = p.matcher(stringToValidate);

    if(m.matches()) {
      System.out.printf("The string \"%s\" has only digits", stringToValidate);
    }
    else {
      System.out.printf("The string \"%s\" is alphanumeric", stringToValidate);
    }
  }
}
