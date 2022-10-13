package JavaSE;

import java.util.Scanner;

/**
 * @title: Java11
 * @Author Xu
 * @Date: 2022/7/28 15:01
 * @Version 1.0
 *          获取一个数二进制序列中所有的偶数位和奇数位，分别输出二进制序列
 */
public class java11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int sum = scanner.nextInt();
        int[] arr = new int[32];
        for (int i = 31; i >= 0; i--) {
            arr[i] = sum % 2;
            sum /= 2;
        }
        System.out.print("二进制序列为：");
        for (int i = 0; i < 32; i++) {
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.print("奇数序列为：");
        for (int i = 0; i <= 31; i += 2) {
            System.out.print(arr[i]);

        }
        System.out.println();
        System.out.print("偶数序列为：");
        for (int i = 1; i <= 30; i += 2) {
            System.out.print(arr[i]);

        }
        scanner.close();
    }
}