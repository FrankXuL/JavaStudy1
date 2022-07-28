package JavaSE;

/**
 * @title: java6
 * @Author Xu
 * @Date: 2022/7/28 14:21
 * @Version 1.0
 * 计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值 。
 */
public class java6 {
    public static void main(String[] args) {
        double sum = 0;
        double temp = 0;
        for (int i = 1; i <= 100; i++) {
            temp = 1.0 / i;
            if (i % 2 == 0) {
                sum -= temp;
            } else {
                sum += temp;
            }
        }
        System.out.println(sum);
    }
}