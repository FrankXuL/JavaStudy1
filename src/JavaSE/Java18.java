package JavaSE;

/**
 * @title: Java18
 * @Author Xu
 * @Date: 2022/7/31 14:33
 * @Version 1.0
 * 递归求 N 的阶乘
 */
public class Java18 {
    public static void main(String[] args) {
        System.out.println(fun(3));
    }

    public static int fun(int n) {
        if (n > 1) {
            return n * fun(n - 1);
        }
        return n;
    }
}
