package JavaDS;

import java.util.Scanner;

/**
 * @Date: 2022/9/7 11:52
 * https://www.nowcoder.com/questionTerminal/2d3f6ddd82da445d804c95db22dcc471?orderByHotValue=1&page=1&onlyReference=false
 * 来源：牛客网
 */
@SuppressWarnings({"all"})
public class nowCoderDemo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int i = 0;
        int count = 0;
        while (i < n) {
            if (arr[i] < arr[i + 1]) {
                while (i < n && arr[i] <= arr[i+1]){
                    i++;
                }
                count++;
                i++;
            }else if(arr[i] == arr[i+1]){
              i++;
            } else{
                while (i < n && arr[i] >= arr[i+1]){
                    i++;
                }
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}