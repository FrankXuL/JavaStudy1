package JavaSE;

import java.util.Arrays;

/**
 * @title: Java28
 * @Author Xu
 * @Date: 2022/8/2 0:04
 * @Version 1.0
 * 调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
 * 如数组：[1,2,3,4,5,6]
 * 调整后可能是：[1, 5, 3, 4, 2, 6]
 */
public class java28 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] % 2 == 0) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}