package JavaSE;

/**
 * @title: Java13
 * @Author Xu
 * @Date: 2022/7/30 14:42
 * @Version 1.0
 * 求 N 的阶乘 。
 */
public class Java13 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Factorial(n));
    }

    public static int Factorial(int n) {
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            sum = sum * i;
        }
        return sum;
    }
}