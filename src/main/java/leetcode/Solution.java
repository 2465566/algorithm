package leetcode;

public class Solution {

  public int[] twoSum(int[] nums, int target) {
    int len = nums.length;
    int result[] = new int[2];

    for (int i = 0; i < len; i++) {
      for (int j = i; j < len - i; j++) {
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
