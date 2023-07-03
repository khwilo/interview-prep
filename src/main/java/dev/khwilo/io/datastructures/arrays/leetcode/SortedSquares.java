package dev.khwilo.io.datastructures.arrays.leetcode;

import java.util.Arrays;

/**
 * Given an integer array nums sorted in non-decreasing order, return an array of the squares of
 * each number sorted in non-decreasing order.
 *
 * <p>Input: nums = [-4,-1,0,3,10] Output: [0,1,9,16,100] Explanation: After squaring, the array
 * becomes [16,1,0,9,100]. After sorting, it becomes [0,1,9,16,100].
 */
public class SortedSquares {

  public static void main(String[] args) {
    int[] nums = {-4, -1, 0, 3, 10};

    int[] sortedArrSquares = build(nums);

    System.out.println(Arrays.toString(sortedArrSquares));
  }

  public static int[] build(int[] nums) {
    int[] sortedArr = new int[nums.length];

//    for (int i = 0; i < nums.length; i++) {
//      sortedArr[i] = nums[i] * nums[i];
//    }
//
//    Arrays.sort(sortedArr);

    int firstPointer = 0;
    int lastPointer = nums.length - 1;

//    for (int i = nums.length - 1; i > 0; i -= 1) {
//      if (Math.abs(nums[firstPointer]) > Math.abs(nums[lastPointer])) {
//        sortedArr[i] = Math.abs(nums[firstPointer]) * Math.abs(nums[firstPointer]);
//        firstPointer += 1;
//      } else {
//        sortedArr[i] = Math.abs(nums[lastPointer]) * Math.abs(nums[lastPointer]);
//        lastPointer -= 1;
//      }
//    }

    int index = nums.length - 1;
    while (firstPointer <= lastPointer) {
      if (Math.abs(nums[firstPointer]) < Math.abs(nums[lastPointer])) {
        sortedArr[index] = Math.abs(nums[lastPointer]) * Math.abs(nums[lastPointer]);
        lastPointer -= 1;
      } else {
        sortedArr[index] = Math.abs(nums[firstPointer]) * Math.abs(nums[firstPointer]);
        firstPointer += 1;
      }
      index -= 1;
    }

    return sortedArr;
  }
}
