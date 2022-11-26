package HeiMa.Sort;

import java.util.Arrays;

/**
 * @title: SelectSort
 * @Author Xu
 * @Date: 22/11/2022 下午 9:24
 * @Version 1.0
 */
public class SelectSort {
    public static void select(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(arr, minIndex, i);
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    public static void select2(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left + 1; i <= right; i++) {
                if (arr[minIndex] > arr[i]) {
                    minIndex = i;
                } else if (arr[maxIndex] < arr[i]) {
                    maxIndex = i;
                }
            }
            if (minIndex != left) {
                swap(arr, minIndex, left);
            }
            //特殊情况 max正好是left就是把最大值更新到mindex了;
            if (maxIndex == left) {
                maxIndex = minIndex;
            }
            if (maxIndex != right) {
                swap(arr, maxIndex, right);
            }
            left++;
            right--;
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}