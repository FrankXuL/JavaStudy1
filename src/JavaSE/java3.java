package JavaSE;

/**
 * @title: java3
 * @Author Xu
 * @Date: 2022/7/27 15:39
 * @Version 1.0
 * 输出 1000 - 2000 之间所有的闰年
 */
public class java3 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1000; i <= 2000; i++) {
            if ((i % 4 == 0) && (i % 100 != 0)) {
                System.out.print(i + " ");
                sum++;
            }
            if (i % 400 == 0) {
                System.out.print(i + " ");
                sum++;
            }
            if (sum == 15) {
                System.out.println();
                sum = 0;
            }
        }
    }
}