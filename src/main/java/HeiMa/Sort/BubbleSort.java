package HeiMa.Sort;

import java.util.Arrays;

/**
 * @title: BubbleSort
 * @Author Xu
 * @Date: 22/11/2022 下午 9:18
 * @Version 1.0
 */
public class BubbleSort {
    public static void Bubble(int[] arr){
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            Boolean swap = false;
            for (int j = 0; j < n - i; j++) {
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
            System.out.println(Arrays.toString(arr));
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}