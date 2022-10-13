package JavaSE;

/**
 * @title: Java27
 * @Author Xu
 * @Date: 2022/8/2 0:01
 * @Version 1.0
 * 实现一个方法 avg, 以数组为参数, 求数组中所有元素的平均值(注意方法的返回值类型).
 */
public class java27 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(avg(arr));
    }

    public static double avg(int[] arr) {
        double count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count / arr.length;
    }
}