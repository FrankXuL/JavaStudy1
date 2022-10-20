package JavaDS;


import java.util.Arrays;
import java.util.Scanner;

/**
 * @Date: 2022/9/6 20:56
 * https://www.nowcoder.com/questionTerminal/248ccf8b479c49a98790db17251e39bb?f=discussion
 * 来源：牛客网
 */
@SuppressWarnings({"all"})
public class nowCoderDemo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            long[] array = new long[3 * n];
            for (int i = 0; i < (3 * n); i++) {
                array[i] = scanner.nextLong();
            }
            Arrays.sort(array);
            long sum = 0;
            for (int i = 0; i < n; i++) {
                sum += array[array.length - (2 * (i + 1))];
            }
            System.out.println(sum);
        }
    }

}