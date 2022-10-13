package JavaSE;

import java.util.Scanner;

/**
 * @title: java7
 * @Author Xu
 * @Date: 2022/7/28 14:28
 * @Version 1.0
 * 求出0～n之间的所有“水仙花数”并输出。
 * (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身）
 */
public class java7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int count = scanner.nextInt();
        for (int i = 100; i <= count; i++) {
            int sum = 0;
            for (int j = i; j != 0; j /= 10) {
                sum++;
            }
            int compare = 0;
            int temp = i;
            for (int k = 0; k < sum; k++) {
                compare += Math.pow(temp % 10, sum);
                temp /= 10;
            }
            if (compare == i) {
                System.out.println(i);
            }
        }
    }
}