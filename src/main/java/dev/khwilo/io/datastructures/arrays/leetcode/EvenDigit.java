package dev.khwilo.io.datastructures.arrays.leetcode;

/**
 * Given an array nums of integers, return how many of them contain an even number of digits.
 *
 * <p>Input: nums = [555,901,482,1771] Output: 1 Explanation: Only 1771 contains an even number of
 * digits.
 */
public class EvenDigit {

  public static void main(String[] args) {
    int[] nums = {12, 345, 2, 6, 7896};

    System.out.println(findNumbers(nums));
  }

  public static int findNumbers(int[] num) {
    int count = 0;

    for (int j : num) {
      String val = Integer.toString(j);

      if (val.length() % 2 == 0) {
        count += 1;
      }
    }

    return count;
  }
}
