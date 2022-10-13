package JavaSE;

/**
 * @title: java2
 * @Author Xu
 * @Date: 2022/7/27 15:32
 * @Version 1.0
 * 打印 1 - 100 之间所有的素数
 */
public class java2 {
    public static void main(String[] args) {
        int j = 2;
        int i = 1;
        for (i = 1; i <= 100; i++) {
            for (j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j == i) {
                System.out.print(i + " ");
            }
        }
    }
}