package mx.linklist;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FirstNonRepeatedChar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me the string you want to print duplicates: ");

    String stringWithDuplicates = scanner.nextLine();

    TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();
    Map.Entry<Character, Integer> entry = null;

    for(Character c : stringWithDuplicates.toCharArray()) {
      if(map.get(c) == null) {
        map.put(c, 1);
      }
      else {
        map.put(c, map.get(c) + 1);
      }
    }

    for(Map.Entry<Character, Integer> value : map.entrySet()) {
      if(value.getValue() == 1) {
        entry = value;
        break;
      }
    }

    if(entry == null) {
      System.out.println("There are no unique characters");
    }
    else {
      System.out.printf("The first non repeated character in the string \"%s\" is \"%s\"", stringWithDuplicates, entry.getKey());
    }
  }
}
