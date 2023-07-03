package dev.khwilo.io.datastructures.strings.hackerrank;

/**
 * You are given a string containing characters and only. Your task is to change it into a string
 * such that there are no matching adjacent characters. To do this, you are allowed to delete zero
 * or more characters in the string.
 *
 * <p>Your task is to find the minimum number of required deletions.
 *
 * <p>Example
 *
 * <p>s = AABAAB
 *
 * <p>Remove an A at positions 0 and 3 to make s = ABAB in 2 deletions.
 */
public class AlternatingCharacters {

  public static void main(String[] args) {

    int testCase1 = noOfDeletions("AAAA");
    int testCase2 = noOfDeletions("BBBBB");
    int testCase3 = noOfDeletions("ABABABAB");
    int testCase4 = noOfDeletions("BABABA");
    int testCase5 = noOfDeletions("AAABBB");

    System.out.println(testCase1);
    System.out.println(testCase2);
    System.out.println(testCase3);
    System.out.println(testCase4);
    System.out.println(testCase5);
  }

  public static int noOfDeletions(String s) {
    StringBuilder newString = new StringBuilder(String.valueOf(s.charAt(0)));
    int count = 0;
    for (int i = 1; i < s.length(); i += 1) {
      if (s.charAt(i - 1) != s.charAt(i)) {
        newString.append(s.charAt(i));
      } else {
        count += 1;
      }
    }
    System.out.println(newString);
    return count;
  }
}
