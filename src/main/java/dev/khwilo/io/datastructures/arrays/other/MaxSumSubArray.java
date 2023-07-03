package dev.khwilo.io.datastructures.arrays.other;

/**
 * Find maximum sum sub array of fixed size K
 *
 * <p>Example input: [4, 2, 1, 7, 8, 1, 2, 8, 1, 0]
 */
public class MaxSumSubArray {

  public static void main(String[] args) {
    int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
    int size = 3;
    int result = find(arr, size);
    System.out.println(result);
  }

  /**
   * Find max sum sub array
   * @param arr arr
   * @param k window size
   * @return max sum sub array
   */
  public static int find(int[] arr, int k) {
    return 0;
  }
}
