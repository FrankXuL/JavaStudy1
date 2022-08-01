package JavaSE;

/**
 * @title: Java26
 * @Author Xu
 * @Date: 2022/8/1 23:57
 * @Version 1.0
 * 实现一个方法 transform, 以数组为参数, 循环将数组中的每个元素 乘以 2 ,
 * 并设置到对应的数组元素上. 例如 原数组为 {1, 2, 3}, 修改之后为 {2, 4, 6}
 */
public class java26 {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        transform(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void transform(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}