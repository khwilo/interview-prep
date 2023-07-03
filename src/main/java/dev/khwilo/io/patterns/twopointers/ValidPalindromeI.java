package dev.khwilo.io.patterns.twopointers;

/**
 * Write a function that takes a string, s, as an input and determines whether it is a palindrome.
 */
public class ValidPalindromeI {

  public static void main(String[] args) {
    String word1 = "abcba";
    String word2 = "abcca";
    String word3 = "abab";
    String word4 = "raceacar";
    String word5 = "racecar";
    String word6 = "baab";
    String word7 = "kayak";
    String word8 = "a";
    String word9 = "dcbaabcd";
    String word10 = "abcba";
    print(word1, check(word1));
    print(word2, check(word2));
    print(word3, check(word3));
    print(word4, check(word4));
    print(word5, check(word5));
    print(word6, check(word6));
    print(word7, check(word7));
    print(word8, check(word8));
    print(word9, check(word9));
    print(word10, check(word10));
  }

  public static boolean check(String s) {

    int k = 0;
    for (int j = s.length() - 1; j >= 0; j -= 1) {
      if (s.charAt(k) != s.charAt(j)) {
        return false;
      }
      k += 1;
    }

    return true;
  }

  public static void print(String word, boolean result) {
    System.out.printf("Is '%s' a palindrome? %s%n", word, result);
  }
}
