package aglorithm;

import java.util.Arrays;

public class QuickSort {
    public static void main(String args[]) {
         int[] a = {1, 4, 2, 3};
         sort(a,0, 3);
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

        sort(a, start, i-1);
        sort(a, i+1, end);
    }
}