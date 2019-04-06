package algorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]) {
         int[] a = {40,60,30,80,50,20,90,20,10,70};
         sort(a,0, 9);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int[] a, int start, int end) {

        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;
        int key = a[start];

        while (i < j) {
            while (i < j && a[j] >= key) {
                j--;
            }
            while (i < j && a[i] < key) {
                i++;
            }

            if (i < j) {
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