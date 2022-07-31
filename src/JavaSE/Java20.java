package JavaSE;

/**
 * @title: Java20
 * @Author Xu
 * @Date: 2022/7/31 14:37
 * @Version 1.0
 * 按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4) （递归）
 */
public class Java20 {
    public static void main(String[] args) {
        fun(1234);
    }

    public static void fun(int n) {
        if (n > 9) {
            fun(n/10);
        }
        System.out.println(n % 10+" ");
    }
}