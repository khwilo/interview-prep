package dev.khwilo.io.patterns.twopointers;

/**
 * Write a function that takes a string as input and checks whether it can be a valid palindrome by
 * removing at most one character from it.
 */
public class ValidPalindromeII {

  public static void main(String[] args) {
    String s1 = "abceba";
    String s2 = "raceacat";
    String s3 = "deead";
    String s4 = "raceacar";
    String s5 = "abbababa";
    String s6 = "abcdeca";
    String s7 = "madame";
    String s8 = "dead";
    String s9 = "abca";
    String s10 = "tebbem";
    String s11 = "eeccccbebaeeabebccceea";

    System.out.println(check(s1)); // true
    System.out.println(check(s2)); // false
    System.out.println(check(s3)); // true
    System.out.println(check(s4)); // true
    System.out.println(check(s5)); // true
    System.out.println(check(s6)); // false
    System.out.println(check(s7)); // true
    System.out.println(check(s8)); // true
    System.out.println(check(s9)); // true
    System.out.println(check(s10)); // false
    System.out.println(check(s11)); // false
  }

  public static boolean check(String s) {
    int low = 0;
    int high = s.length() - 1;

    while (low < high) {
      if (s.charAt(low) == s.charAt(high)) {
        low += 1;
        high -= 1;
      } else {
        return find(s, low + 1, high) || find(s, low, high - 1);
      }
    }
    return true;
  }

  private static boolean find(String s, int low, int high) {
    while (low < high) {
      if (s.charAt(low) != s.charAt(high)) {
        return false;
      }
      low += 1;
      high -= 1;
    }
    return true;
  }
}
