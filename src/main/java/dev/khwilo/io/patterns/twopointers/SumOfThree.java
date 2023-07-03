package dev.khwilo.io.patterns.twopointers;

import java.util.Arrays;

/**
 * Given an array of integers, nums, and an integer value, target, determine if there are any three
 * integers in nums whose sum is equal to the target, that is, nums[i] + nums[j] + nums[k] ==
 * target. Return TRUE if three such integers exist in the array. Otherwise, return FALSE.
 */
public class SumOfThree {

  public static void main(String[] args) {
    int[] nums1 = {3, 7, 1, 2, 8, 4, 5};
    int[] nums2 = {2, 3, 1};
    int[] nums3 = {1, -1, 1};
    int[] nums4 = {1, 2, 4, 6, 8, 20};
    int[] nums5 = {1, -1, 0};
    int[] nums6 = {3, 7, 1, 2, 8, 4, 5};
    int[] nums7 = {3, 7, 1, 2, 8, 4, 5};
    int[] nums8 = {-1, 2, 1, -4, 5, -3};
    int[] nums9 = {-1, 2, 1, -4, 5, -3};
    int[] nums10 = {8, 2, 4, 9, 5};

    System.out.println(findSumToTarget(nums1, 20)); // true
    System.out.println(findSumToTarget(nums2, 6)); // true
    System.out.println(findSumToTarget(nums3, 2)); // false
    System.out.println(findSumToTarget(nums4, 31)); // false
    System.out.println(findSumToTarget(nums5, -1)); // false
    System.out.println(findSumToTarget(nums6, 10)); // true
    System.out.println(findSumToTarget(nums7, 21)); // false
    System.out.println(findSumToTarget(nums8, -8)); // true
    System.out.println(findSumToTarget(nums9, 0)); // true
    System.out.println(findSumToTarget(nums10, 17)); // true
  }

  public static boolean findSumToTarget(int[] nums, int target) {

    if (nums.length < 3) {
      return false;
    }

    Arrays.sort(nums);

    for (int i = 0; i < nums.length - 2; i += 1) {
      int low = i + 1;
      int high = nums.length - 1;

      while (low < high) {
        int sum = nums[i] + nums[low] + nums[high];

        if (sum == target) {
          return true;
        } else if (sum < target) {
          low += 1;
        } else {
          high -= 1;
        }
      }
    }

    return false;
  }
}
