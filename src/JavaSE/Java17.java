package JavaSE;

/**
 * @title: Java17
 * @Author Xu
 * @Date: 2022/7/30 15:09
 * @Version 1.0
 * 在同一个类中定义多个方法：要求不仅可以求2个整数的最大值，还可以求3个小数的最大值
 */
public class Java17 {
    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(1.2,1.5,2.5));
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static double max(double a, double b, double c) {
        return Math.max((Math.max(a, b)), c);
    }

}