package HeiMa.Sort;

/**
 * @title: BinarySearch
 * @Author Xu
 * @Date: 25/11/2022 下午 9:10
 * @Version 1.0
 */
public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            //int mid = (left + right) / 2;
            //int mid = left + (right - left) / 2;
            int mid = (left + right) >>> 1;
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] > target) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}