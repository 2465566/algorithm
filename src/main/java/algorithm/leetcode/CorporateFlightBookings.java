package algorithm.leetcode;

public class CorporateFlightBookings {

    /**
     * 这里有 n 个航班，它们分别从 1 到 n 进行编号。
     *
     * 我们这儿有一份航班预订表，表中第 i 条预订记录 bookings[i] = [i, j, k] 意味着我们在从 i 到 j 的每个航班上预订了 k 个座位。
     *
     * 请你返回一个长度为 n 的数组 answer，按航班编号顺序返回每个航班上预订的座位数。
     *
     * 示例：
     * 输入：bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
     * 输出：[10,55,45,25,25]
     *
     * 提示：
     * 1 <= bookings.length <= 20000
     * 1 <= bookings[i][0] <= bookings[i][1] <= n <= 20000
     * 1 <= bookings[i][2] <= 10000
     * @param args
     */

    public static void main(String[] args) {

    }


    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] counters = new int[n];
        for (int[] booking : bookings) {
            counters[booking[0] - 1] += booking[2];
            if (booking[1] < n) {
                counters[booking[1]] -= booking[2];
            }
        }
        for (int i = 1; i < n; ++i) {
            counters[i] += counters[i - 1];
        }
        return counters;
    }


    /**
     * 1、题目描述：
     * 给定多组原本的航班预订信息（航班号，座位号，乘客姓名），以及多组要改签的航班信息（原本航班号，原本座位号，新航班号，新座位号）
     *
     * 输出最后的航班预订信息，要是有重复的内容，以最新改签的为标准
     *
     * 输入的内容如下： 3 表示原本的航班信息数，2表示要改签的航班数
     *
     * 3
     * CZ7132,A1,ZHANGSAN
     * CZ7132,A2,ZHAOSI
     * CZ7156,A2,WANGWU
     * 2
     * CZ7132,A1,CZ7156,A2
     * CZ7156,A2,CZ7156,A3
     *
     * 输出内容如下：
     * CZ7132,A2,ZHAOSI
     * CZ7156,A2,ZHANGSA
     * CZ7156,A3,WANGW
     *
     * 2、思路：
     * 　　将原航班的信息分解，看成（ticket,name）的形式。
     *
     * 　　首先，将原航班信息存到hashMap中，存成两份，（ticket,name），（name,ticket）；将票的修改信息也存入到hashMap中，
     *
     * 　　然后，根据修改信息，锁定原信息并将其修改，存入结果集。
     *
     * 3、代码：
     */
}

