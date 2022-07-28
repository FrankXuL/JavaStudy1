package JavaSE;

import java.util.Scanner;

/**
 * @title: Java5
 * @Author Xu
 * @Date: 2022/7/28 14:15
 * @Version 1.0
 * 求一个整数，在内存当中存储时，二进制1的个数。
 */
public class Java5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int sum = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < 31; i++) {
            if ((1 & (sum >> i)) == 1) {
                count++;
            }
        }
        System.out.println("二进制1的个数为：" + count);
    }
}