package dev.khwilo.io.patterns.twopointers;

/**
 * Given a sentence, reverse the order of its words without affecting the order of letters within a
 * given word.
 */
public class ReverseWords {

  public static void main(String[] args) {
    String sentence1 = "Hello Friend";
    String sentence2 = "Welcome to Educative";
    String sentence3 = "Hurray 3 2 1";
    String sentence4 = "Hello     World";
    String sentence5 = "the sky is blue";
    String sentence6 = "  hello world";

    System.out.println(transformBrute(sentence1)); // "Friend Hello"
    System.out.println(transformBrute(sentence2)); // "Educative to Welcome"
    System.out.println(transformBrute(sentence3)); // "1 2 3 Hurray"
    System.out.println(transformBrute(sentence4));
    System.out.println(transformBrute(sentence5));
    System.out.println(transformBrute(sentence6));

    System.out.println("------------------");

    System.out.println(transformPointer(sentence1));
    System.out.println(transformPointer(sentence2));
    System.out.println(transformPointer(sentence3));
    System.out.println(transformPointer(sentence4));
    System.out.println(transformPointer(sentence5));
    System.out.println(transformPointer(sentence6));
  }

  public static String transformBrute(String sentence) {
    String[] split = sentence.trim().split(" +");
    String[] output = new String[split.length];

    for (int i = split.length - 1, j = 0; i >= 0; i -= 1, j += 1) {
      output[j] = split[i];
    }

    return String.join(" ", output);
  }

  public static String transformPointer(String sentence) {
    char[] s1 = sentence.toCharArray();
    String s2 = cleanSpaces(s1, s1.length);
    //    String s3 = String.join(" ", sentence.trim().split(" +"));
    StringBuilder stringBuilder = new StringBuilder(s2);

    strRev(stringBuilder, 0, stringBuilder.length() - 1);

    int n = stringBuilder.length();
    int start = 0, end = 0;

    // find the start index of each word by detecting spaces
    while (start < n) {
      // find the end index of each word
      while (end < n && stringBuilder.charAt(end) != ' ') {
        end += 1;
      }
      // reverse the word in place
      strRev(stringBuilder, start, end - 1);
      // move to the next word
      start = end + 1;
      end += 1;
    }
    return stringBuilder.toString();
  }

  public static String cleanSpaces(char[] a, int n) {
    String str = new String(a, 0, n);

    // replace multiple spaces with a single space
    // trim extra spaces at start and end of the string
    return str.replaceAll("\\s+", " ").trim();
  }

  // reverse a string in place
  public static void strRev(StringBuilder sb, int start, int end) {
    while (start < end) {
      char temp = sb.charAt(start);
      sb.setCharAt(start++, sb.charAt(end));
      sb.setCharAt(end--, temp);
    }
  }
}
