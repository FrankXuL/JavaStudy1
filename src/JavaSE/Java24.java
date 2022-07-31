package JavaSE;

/**
 * @title: Java225
 * @Author Xu
 * @Date: 2022/7/31 14:56
 * @Version 1.0
 */
public class Java24 {
    public static void main(String[] args) {
        int[] arr = new int[101];
        for (int i = 1; i <= 100; i++) {
            arr[i]=i;
        }
        for (int i = 1; i <= 100; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}