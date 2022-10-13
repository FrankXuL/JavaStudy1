package JavaSE;

/**
 * @title: Java22
 * @Author Xu
 * @Date: 2022/7/31 14:44
 * @Version 1.0
 * 递归求斐波那契数列的第 N 项
 */
public class java22 {
    public static void main(String[] args) {
        System.out.println(fun(8));
    }
    public static int fun(int n){
        if(n>2){
            return fun(n-1)+fun(n-2);
        }
        return 1;
    }

}