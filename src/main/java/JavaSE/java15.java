package JavaSE;

/**
 * @title: Java15
 * @Author Xu
 * @Date: 2022/7/30 14:57
 * @Version 1.0
 * 求斐波那契数列的第n项。(迭代实现)
 */
public class java15 {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    public static int fib(int n) {
        if (n <= 2){
            return n;
        }else {
            return fib(n-1)+fib(n-2);
        }
    }

}