package JavaSE;

/**
 * @title: Java14
 * @Author Xu
 * @Date: 2022/7/30 14:44
 * @Version 1.0
 */
public class Java14 {
    public static void main(String[] args) {
        int a = Factorial2(3);
        System.out.println(Factorial2(3));
    }

    public static int Factorial2(int n) {
        int count = 0;
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
            count += sum;
        }
        return count;
    }
}