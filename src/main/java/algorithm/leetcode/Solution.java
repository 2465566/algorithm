package algorithm.leetcode;

public class Solution {


  public static void main(String[] args) {
    int[] array = {1,2,3,4,5};
    twoSum(array, 5);
  }

  public static int[] twoSum(int[] nums, int target) {
    int len = nums.length;
    int result[] = new int[2];

    for (int i = 0; i < len; i++) {
      for (int j = i+1; j < len; j++) {
        int senc = i + 1;
        if (target == nums[i] + nums[senc]) {
          result[0] = i;
          result[1] = senc;
          return result;
        }
      }
    }
    return result;
  }
}
