package JavaDS;


import java.util.Stack;

/**
 * @title: sort
 * @Author Xu
 * @Date: 12/10/2022 下午 9:01
 * @Version 1.0
 */
@SuppressWarnings({"all"})
public class sort {
    public static void main(String[] args) {
        int[] arr = {13, 55, 14, 87, 1, 2, 8};
        //InsertSort(arr);
        //ShellSort(arr);
        //SelectSort(arr);
        //SelectSort2(arr);
        //HeapSort(arr);
        //QuickSort(arr);
        QuickSortNonR(arr);
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

    private static void InsertSort(int[] array, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int tmp = array[i];
            int j = i - 1;
            for (; j >= left; j--) {
                if (array[j] > tmp) {
                    array[j + 1] = array[j];
                } else {
                    //array[j+1] = tmp;
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

    /**
     * @description: 希尔排序
     * 时间复杂度: 当gap每次/2时O(n^1.3)
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
     * @description: 选择排序(两边同时找最大和最小)
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
                swap(array, minIndex, left);

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
                swap(array, maxIndex, right);
            }
            left++;
            right--;
        }
    }

    /**
     * @description: 堆排序
     * 时间复杂度: O(N^logN)
     * 空间复杂度: O(1)
     * @author Xu
     * @date: 16/10/2022 下午 6:14
     */
    public static void HeapSort(int[] array) {
        CreateHeap(array);
        int end = array.length - 1;
        while (end > 0) {
            swap(array, 0, end);
            ShiftDown(array, 0, end);
            end--;
        }
    }

    private static void CreateHeap(int[] array) {
        for (int parent = (array.length - 1 - 1) / 2; parent >= 0; parent--) {
            ShiftDown(array, parent, array.length);
        }
    }

    private static void ShiftDown(int[] array, int parent, int length) {
        int child = 2 * parent + 1;
        while (child < length) {
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }
            if (array[child] > array[parent]) {
                swap(array, parent, child);
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
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
        for (int i = 0; i < array.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    flag = true;
                }
            }
            if (flag == false) {
                break;
            }
        }
    }

    /**
     * @description: 快速排序
     * 时间复杂度: O(N*logN)
     * 空间复杂度: O(logN)
     * 稳定性:不稳定的排序
     * @author Xu
     * @date: 13/10/2022 下午 7:51
     */
    public static void QuickSort(int[] array) {
        quick(array, 0, array.length - 1);
    }

    public static void quick(int[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        if (end - start + 1 <= 15) {
            //对 start 和 end区间 范围内 使用插入排序
            InsertSort(array, start, end);
            return;
        }
        int index = findMidValOfIndex(array, start, end);
        swap(array, start, index);

        //int pivot = partitionHoare(array, start, end);  //Hoare法
        //int pivot = partition1(array, start, end);  //挖坑法
        int pivot = partition2(array, start, end);  //前后指针

        quick(array, start, pivot - 1);
        quick(array, pivot + 1, end);
    }

    private static int partitionHoare(int[] array, int left, int right) {
        int i = left;
        int pivot = array[left];
        while (left < right) {
            while (left < right && array[right] >= pivot) {
                right--;
            }
            while (left < right && array[left] <= pivot) {
                left++;
            }
            swap(array, left, right);
        }
        swap(array, left, i);
        return left;
    }

    private static int partition1(int[] array, int left, int right) {
        int pivot = array[left];
        while (left < right) {
            while (left < right && array[right] >= pivot) {
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= pivot) {
                left++;
            }
            array[right] = array[left];
        }
        array[left] = pivot;
        return left;
    }

    private static int partition2(int[] array, int left, int right) {
        int prev = left;
        int cur = left + 1;
        while (cur <= right) {
            if (array[cur] < array[left] && array[++prev] != array[left]) {
                swap(array, prev, cur);
            }
            cur++;
        }
        swap(array, prev, left);
        return prev;
    }

    private static int findMidValOfIndex(int[] array, int start, int end) {
        int midIndex = (start + end) / 2;
        if (array[start] < array[end]) {
            if (array[midIndex] < array[start]) {
                return start;
            } else if (array[midIndex] > array[end]) {
                return end;
            } else {
                return midIndex;
            }
        } else {
            if (array[midIndex] > array[start]) {
                return start;
            } else if (array[midIndex] < array[end]) {
                return end;
            } else {
                return midIndex;
            }
        }
    }

    public static void QuickSortNonR(int[] array) {
        Stack<Integer> stack = new Stack<>();
        int start = 0;
        int end = array.length - 1;
        int pivot = partition1(array, start, end);
        if (pivot > start + 1) {
            stack.push(start);
            stack.push(pivot - 1);
        }
        //2.判断右边是不是有2个元素
        if (pivot < end - 1) {
            stack.push(pivot + 1);
            stack.push(end);
        }
        while (!stack.isEmpty()) {
            end = stack.pop();
            start = stack.pop();
            pivot = partition1(array, start, end);
            //3.判断左边是不是有2个元素
            if (pivot > start + 1) {
                stack.push(start);
                stack.push(pivot - 1);
            }
            //4.判断右边是不是有2个元素
            if (pivot < end - 1) {
                stack.push(pivot + 1);
                stack.push(end);
            }
        }
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    /**
     * @description: 归并排序
     * 时间复杂度: O(N*logN)
     * 空间复杂度: O(N)
     * 稳定性:稳定的排序
     * @author Xu
     * @date: 17/10/2022 下午 3:05
     */
    public static void MergeSort(int[] array) {
        mergeSortChild(array, 0, array.length - 1);
    }

    private static void mergeSortChild(int[] array, int left, int right) {
        if (left == right) {
            return;
        }
        int mid = (left + right) / 2;
        mergeSortChild(array, left, mid);
        mergeSortChild(array, mid + 1, right);
        merge(array, left, mid, right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int s1 = left;
        int e1 = mid;
        int s2 = mid + 1;
        int e2 = right;
        int[] tmpArr = new int[right - left + 1];
        int k = 0;//表示tmpArr 的下标
        while (s1 <= e1 && s2 <= e2) {
            if (array[s1] <= array[s2]) {
                tmpArr[k++] = array[s1++];
            } else {
                tmpArr[k++] = array[s2++];
            }
        }
        while (s1 <= e1) {
            tmpArr[k++] = array[s1++];
        }
        while (s2 <= e2) {
            tmpArr[k++] = array[s2++];
        }
        //tmpArr当中 的数据 是right  left 之间有序的数据
        for (int i = 0; i < k; i++) {
            array[i + left] = tmpArr[i];
        }
    }

    public static void mergeSort(int[] array) {
        int gap = 1;
        while (gap < array.length){
            for (int i = 0; i < array.length; i += gap*2) {
                int left = i;
                int mid = left + gap -1;
                int right = mid+gap;
                if(mid >= array.length) {
                    mid = array.length-1;
                }
                if(right >= array.length) {
                    right = array.length-1;
                }
                merge(array,left,mid,right);
            }
            gap *= 2;
        }
    }
    
    /** 
     * @description: 计数排序
     * 时间复杂度：O(n+范围) -》 范围越小，时间复杂度越小
     * 空间复杂度：O(范围)
     * @author Xu
     * @date: 17/10/2022 下午 3:34
     */ 
    public static void countSort(int[] array) {
        int maxVal = array[0];
        int minVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if(array[i] > maxVal) {
                maxVal = array[i];
            }
            if(array[i] < minVal) {
                minVal = array[i];
            }
        }
        int len = maxVal - minVal + 1 ;
        int[] countArr = new int[len];
        for (int i = 0; i < array.length; i++) {
            int val = array[i];
            countArr[val-minVal] ++;
        }
        int index = 0;
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                //不敢打印
                array[index] = i+minVal;
                index++;
                countArr[i]--;
            }
        }
    }
}