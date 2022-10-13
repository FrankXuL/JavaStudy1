package JavaSE;

import java.util.Scanner;

/**
 * @title: Java8
 * @Author Xu
 * @Date: 2022/7/28 14:49
 * @Version 1.0
 * 输出n*n的乘法口诀表，n由用户输入。
 */
public class java8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + " ");
            }
            System.out.println();
        }
    }
}