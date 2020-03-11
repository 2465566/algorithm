package algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]) {
         int[] a = {4,3,6,1,5,2};
         sort(a,0, 5);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int start, int end) {

        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;    // start end 留着最后递归做边界用, 用i，j
        int key = a[start];

        while (i < j) {
            while (i < j && a[j] >= key) {  //从右往左，找第一个比key小的值
                j--;
            }
            while (i < j && a[i] <= key) {  //从左往右，找第一个比key大的值
                i++;
            }

            if (i < j) {      //两个值找到后，互换位置
                int p = a[i];
                a[i] = a[j];
                a[j] = p;
            }
        }

        int k = a [start];
        a[start] = a[i];
        a[i] = k;
        // 经过一次排序 a[i] 是确定的数组排序的中间位置
        sort(a, start, i-1);
        sort(a, i+1, end);
    }
}