package algorithm.leetcode;

import java.util.Scanner;

public class Baoshu {


    public static void main(String[] args) {

        int n = 22;//n的取值
        int num = n;//记录剩余数个数
        int arr[] = new int[n];//标记剩余数的位置 0 代表存活,初始全部存活   1 代表删除
        int flag = 0; //标记报名，到三降0
        int del = 3;//扩展字段，将报三的删除，可以任意定义
        while (num != 1) {//当剩余数量为1时，停止循环
            for (int i = 0; i < n; i++) {//
                if (arr[i] == 0) { //判断当前元素是否存活
                    flag++; //元素存活，报名数加一;每次for循环后，报名数会接着下次循环继续增长，约瑟夫环循环
                }
                if (flag == del) {//当报名数为三时
                    arr[i] = 1;//将当前元素标记为1，删除操作
                    flag = 0;//报名数降为0
                    num--;//总人数减去1
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                System.out.println(i + 1);//数组下标从0开始
            }
        }
    }


//    static int all = 1;
//
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        while (scan.hasNext()) {
//            int input = scan.nextInt();
//            if (input < 1) {
//                return;
//            } else {
//                boolean[] persons = doCall(input);
//                for (int i = 0; i < persons.length; i++) {
//                    if (persons[i]) {
//                        System.out.println("最后留下的是：" + (i + 1) + "号。");
//                    }
//                }
//            }
//        }
//    }
//
//    public static boolean[] doCall(int person) {
//        boolean[] persons = new boolean[person];
//        int number = person, key = 0;
//        for (int i = 0; i < person; i++)
//            persons[i] = true;
//        while (number != 1) {
//            for (int i = 0; i < person; i++) {
//                if (!persons[i]) {
//                    continue;
//                } else {
//                    key++;
//                    if (key % 3 == 0) {
//                        System.out.println("编号为：" + (i + 1) + "的人退出。");
//                        persons[i] = false;
//                    }
//                }
//            }
//            number = 0;
//            for (int i = 0; i < person; i++) {
//                if (persons[i]) {
//                    number++;
//                }
//            }
//        }
//        return persons;
//    }
}
