package JavaSE;

/**
 * @title: Java21
 * @Author Xu
 * @Date: 2022/7/31 14:41
 * @Version 1.0
 * 写一个递归方法，输入一个非负整数，返回组成它的数字之和
 */
public class java21 {
    public static void main(String[] args) {
        System.out.println(fun(1234));
    }

    public static int fun(int n) {
        if (n > 9) {
            return n % 10 + fun(n / 10);
        }
        return n;
    }

}