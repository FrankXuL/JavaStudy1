package HeiMa.Sort;

import java.util.Arrays;

/**
 * @title: InsertSort
 * @Author Xu
 * @Date: 22/11/2022 下午 9:35
 * @Version 1.0
 */
public class InsertSort {
    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;
            while (j >= 0) {
                if (arr[j] > tmp) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
                j--;
            }
            arr[j + 1] = tmp;
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}