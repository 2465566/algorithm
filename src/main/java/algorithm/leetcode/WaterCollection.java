package algorithm.leetcode;

public class WaterCollection {

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int max = maxArea(a);
        System.out.println(max);
    }

    public static int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while (i < j) {
            int area = (j - i) * Math.min(height[i], height[j]);  //面积为底乘以高
            res = Math.max(res, area);  //选出大的面积
            if (height[i] <= height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }

}
