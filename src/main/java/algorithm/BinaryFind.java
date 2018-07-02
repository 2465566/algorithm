package algorithm;

import java.util.Arrays;

public class BinaryFind {

    public static void main(String args[]) {
        int[] a = {40,60,30,80,50,20,90,20,10,70};
        int target = 30;
        Arrays.sort(a);
        System.out.println(find(a, target) ? "get result successful" : " can not find the target");
    }

    public static boolean find(int a[], int target) {
        int min = 0;
        int max = a.length - 1;

        while (min <= max) {
            int middle = (min + max) / 2;
            if (target > a[middle]) {
                min = middle + 1;
            }
            if (target < a[middle]) {
                max = middle - 1;
            }

            if (a[middle] == target) {
                return true;
            }
        }
        return false;
    }
}
