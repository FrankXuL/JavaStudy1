package JavaDS;


/**
 * @title: sort
 * @Author Xu
 * @Date: 12/10/2022 下午 9:01
 * @Version 1.0
 */
public class sort {
    public static void main(String[] args) {
        int[] arr = {13, 55, 14, 87, 1, 2, 8};
        //InsertSort(arr);
        //ShellSort(arr);
        //SelectSort(arr);
        //SelectSort2(arr);
        System.out.print("排序后:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    /**
     * @description: 直接插入排序
     * 时间复杂度: O(n^2)
     * 空间复杂度: O(1)
     * 稳定性:稳定
     * 当数据量不多，且基本上趋于有序的时候，直接插入排序是非常快
     * @author Xu
     * @date: 13/10/2022 下午 7:07
     */
    public static void InsertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i - 1;
            while (j >= 0) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
                j--;
            }
            array[j + 1] = tmp;
        }
    }

    /**
     * @description: 希尔排序
     * 时间复杂度: O(n^1.3)
     * 稳定性:不稳定
     * @author Xu
     * @date: 13/10/2022 下午 7:07
     */
    public static void ShellSort(int[] array) {
        int gap = array.length;
        while (gap > 1) {
            gap /= 2;
            for (int i = gap; i < array.length; i++) {
                int tmp = array[i];
                int j = i - gap;
                while (j >= 0) {
                    if (array[j] > tmp) {
                        array[j + gap] = array[j];
                    } else {
                        break;
                    }
                    j -= gap;
                }
                array[j + gap] = tmp;
            }
        }
    }

    /**
     * @description: 选择排序
     * 时间复杂度: O(n^2)
     * 空间复杂度: O(1)
     * 稳定性:不稳定
     * @author Xu
     * @date: 13/10/2022 下午 7:51
     */
    public static void SelectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minDex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minDex]) {
                    minDex = j;
                }
            }
            if (minDex != i) {
                swap(array, minDex, i);
            }
        }
    }

    /**
     * @description: 选择排序2
     * 时间复杂度: O(n^2)
     * 空间复杂度: O(1)
     * 稳定性:不稳定
     * @author Xu
     * @date: 13/10/2022 下午 7:51
     */
    public static void SelectSort2(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int minIndex = left;
            int maxIndex = left;
            for (int i = left + 1; i <= right; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            //更新最小值
            if (minIndex != left) {
                //int tmp = array[left];
                //array[left] = array[minIndex];
                //array[minIndex] = tmp;
                swap(array,minIndex,left);

            }

            //特殊情况 max正好是left就是把最大值更新到mindex了;
            if (maxIndex == left) {
                maxIndex = minIndex;
            }
            //更新最大值
            if (maxIndex != right) {
                //int tmp = array[right];
                //array[right] = array[maxIndex];
                //array[maxIndex] = tmp;
                swap(array,maxIndex,right);
            }
            left++;
            right--;
        }
    }

    /**
     * @description: 冒泡排序
     * 时间复杂度: O(n^2)
     * 空间复杂度: O(1)
     * 稳定性:不稳定
     * @author Xu
     * @date: 13/10/2022 下午 7:51
     */
    public static void BubbleSort(int[] array) {
        for (int i = 0 ; i< array.length-1 ; i++){
            boolean flag = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    swap(array,j,j+1);
                    flag = true;
                }
            }
            if(flag == false) {
                break;
            }
        }

    }

    /**
     * @description: 快速排序
     * 时间复杂度: O(n^2)
     * 空间复杂度: O(1)
     * 稳定性:不稳定
     * @author Xu
     * @date: 13/10/2022 下午 7:51
     */
    public static void QuickSort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    public static void quick(int[] array, int start, int end) {

    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}