package algorithm.leetcode;

import java.util.Scanner;

public class Collection5Fu {
    public static void main(String[] args) {
        getWFCount();
    }

    //获取五福套数
    public static void getWFCount() {
        System.out.println("请输入一组由0和1组成的5位字符串，中间用,号分割：");
        System.out.println("如：10110,11001");
        System.out.println("请输入：");
        while (true) {
            Scanner sc = new Scanner(System.in);
            String s = sc.next();
            if (null == s || "" == s) {
                System.out.println("输入有误，请重新输入：");
                continue;
            } else {
                String[] sq = s.split(",");
                int[] list = {0, 0, 0, 0, 0};
                for (String sPart : sq) {
                    if (sPart.length() != 5) {
                        System.out.println("输入有误，请重新输入：");
                        continue;
                    }
                    if (!sPart.matches("[01]{5}")) {
                        System.out.println("输入有误，请重新输入：");
                        continue;
                    }
                    for (int i = 0; i < sPart.length(); i++) {
                        if (sPart.charAt(i) == '1') {
                            int n = list[i];
                            n++;
                            list[i] = n;
                        }
                    }
                }
                for (int i = 0; i < list.length - 1; i++) {
                    for (int j = 0; j < list.length - 1 - i; j++)// j开始等于0，
                    {
                        if (list[j] < list[j + 1]) {
                            int temp = list[j];
                            list[j] = list[j + 1];
                            list[j + 1] = temp;
                        }
                    }
                }
                System.out.println("该团队能凑齐" + list[4] + "套五福");
                sc.close();
                break;
            }
        }
    }
}
