package mx.linklist;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Anagram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Give me the first word: ");
    String word1 = scanner.nextLine();
    System.out.print("Give me the first word: ");
    String word2 = scanner.nextLine();

    Set<Character> set = null;

    boolean isAnagram = true;
    if(word1.length() == word2.length()) {
      set = new HashSet<Character>();

      for(Character c : word1.toCharArray()) {
        set.add(c);
      }

      for(Character c : word2.toCharArray()) {
        if(!set.contains(c)) {
          isAnagram = false;
          break;
        }
      }
    }
    else {
      isAnagram = false;
    }

    if(isAnagram) {
      System.out.printf("The word %s and the word %s are anagrams", word1, word2);
    }
    else {
      System.out.printf("The word %s and the word %s are not anagrams", word1, word2);
    }
  }
}
