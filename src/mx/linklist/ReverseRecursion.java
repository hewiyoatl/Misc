package mx.linklist;

public class ReverseRecursion {

  public static void main(String[] args) {
    String stringToReverse = "kkconqueso";

    System.out.printf("%s", reverse(stringToReverse));
  }

  public static String reverse(String value) {
    if (value.length() < 2) {
      return value;
    }

    return reverse(value.substring(1)) + value.charAt(0);
  }
}
