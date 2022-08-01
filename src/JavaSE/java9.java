package JavaSE;

import java.util.Scanner;

/**
 * @title: Java9
 * @Author Xu
 * @Date: 2022/7/28 14:52
 * @Version 1.0
 * 输出一个整数的每一位，如：123的每一位是3，2，1
 */
public class java9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        while (count != 0) {
            System.out.print(count % 10 + ",");
            count /= 10;
        }
    }
}