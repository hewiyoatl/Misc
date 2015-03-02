package mx.linklist;

import java.util.Scanner;

public class StringToInt {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Type the number you want to convert");
    String stringToNumber = scanner.nextLine();

    if(stringToNumber != null && !stringToNumber.isEmpty()) {

      int number = 0;
      Integer k = 0;
      for(char c : stringToNumber.toCharArray()) {
        if(c > '0' && c < '9') {
          number = (number * 10) + Integer.valueOf(c + "");
        }

      }
      String kk = null;
    }
    else {
      System.out.println("It is an empty or null string");
    }
  }
}
