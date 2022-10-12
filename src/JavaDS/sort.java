package JavaDS;

import java.util.Arrays;

/**
 * @title: sort
 * @Author Xu
 * @Date: 12/10/2022 下午 9:01
 * @Version 1.0
 */
public class sort {
    public static void main(String[] args) {
        int[] arr = {13,55,14,87,1,2,8};
        insertSort(arr);
        for (int i = 0;i < arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0){
                if(array[j] > tmp){
                    array[j+1] = array[j];
                }else{
                    //array[j+1] = tmp;
                    break;
                }
                j--;
            }
            array[j+1] = tmp;
        }
    }
}