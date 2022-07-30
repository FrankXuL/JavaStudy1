package JavaSE;

/**
 * @title: Java16
 * @Author Xu
 * @Date: 2022/7/30 14:59
 * @Version 1.0
 * 在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。 并执行代码，求出结果
 */
public class Java16 {
    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1.3,1.2,1.4));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double a,double b,double c){
        return a+b+c;
    }
}
