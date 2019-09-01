package algorithm;

import java.util.Arrays;

public class BubbleSort {

  public static void BubbleSort(int[] arr) {
    int temp;//定义一个临时变量
    for (int i = 0; i < arr.length - 1; i++) {//冒泡趟数
      for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j + 1] < arr[j]) {
          temp = arr[j];
          arr[j] = arr[j + 1];
          arr[j + 1] = temp;
        }
      }
    }
  }

//  public static void sotr(int a[], int start, int end) {
//
//    if (start > end) {
//      return;
//    }
//
//    int i = start;
//    int j = end;
//    int key = a[start];
//
//    while (i < j) {
//      while (i < j && a[j] >= key) {
//        j--;
//      }
//      while (i < j && a[i] <= key) {
//        i++;
//      }
//      int tmp = a[i];
//      a[i] = a[j];
//      a[j] = tmp;
//    }
//
//    int tmp1 = a[i];
//    a[i] = a[start];
//    a[start] = tmp1;
//
//    sotr(a, start, i - 1);
//
//    sotr(a, i + 1, end);
//
//  }

  public static void main(String[] args) {
    int arr[] = new int[]{1, 6, 9, 2, 2, 5};
//    BubbleSort.BubbleSort(arr);
//    sotr(arr,0,5);
    System.out.println(Arrays.toString(arr));
  }
}
