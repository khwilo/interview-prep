package dev.khwilo.io.datastructures.arrays.leetcode;

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
 *
 * <p>Input: nums = [1,1,0,1,1,1] Output: 3 Explanation: The first two digits or the last three
 * digits are consecutive 1s. The maximum number of consecutive 1s is 3.
 */
public class MaxConsecutiveOnes {

  public static void main(String[] args) {
    int[] num = {1, 1, 0, 1, 1, 1};

    System.out.println(find(num));
  }

  public static int find(int[] num) {
    int max = 0;
    int count = 0;

    for (int j : num) {
      if (j == 1) {
        count += 1;
        max = Math.max(count, max);
      } else {
        count = 0;
      }
    }

    return max;
  }
}
