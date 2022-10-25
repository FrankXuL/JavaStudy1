package JavaSE;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @title: java1
 * @Author Xu
 * @Date: 2022/7/25 19:27
 * @Version 1.0
 * 给定一个数字，判定一个数字是否是素数v
 */
public class java1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        System.out.println("请输入一个数");
        int num = scanner.nextInt();
        if (num <= 2) {
            System.out.println("该数是一个素数");
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("该数是一个素数");
        } else {
            System.out.println("该数不是一个素数");
        }
    }
}