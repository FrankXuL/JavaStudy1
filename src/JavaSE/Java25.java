package JavaSE;

/**
 * @title: Java25
 * @Author Xu
 * @Date: 2022/7/31 14:59
 * @Version 1.0
 */
public class Java25 {
    public static void main(String[] args) {
        int[] arr =new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]=i;
        }
        prinArray(arr);
    }
    public static void prinArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
}