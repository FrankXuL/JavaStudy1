package JavaSE;

/**
 * @title: Java19
 * @Author Xu
 * @Date: 2022/7/31 14:35
 * @Version 1.0
 * 递归求 1 + 2 + 3 + ... + 10
 */
public class Java19 {
    public static void main(String[] args) {
        System.out.println(fun(10));
    }

    public static int fun(int n){
        if(n>1){
            return n+fun(n-1);
        }
        return n;
    }
}