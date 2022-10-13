package JavaSE;

/**
 * @title: Java29
 * @Author Xu
 * @Date: 2022/8/2 0:33
 * @Version 1.0
 * 给定一个有序整型数组, 实现二分查找
 */
public class Java29 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(find(arr, 2));
    }
    public static int find(int[] arr, int key) {
        int i = 0;
        int j = arr.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (key < arr[mid]) {
                j = mid - 1;
            } else if (key > arr[mid]) {
                i = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}