package JavaDS;

import java.util.Scanner;

/**
 * @Author Xu
 * @Date: 2022/9/8 22:22
 * WY33 计算糖果
 */
public class nowCoderDemo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        int A = (a+c)/2;
        int B1 = (b+d)/2;
        int B2 = (c-a)/2;
        int C =(d-b)/2;
        if(B1 != B2){
            System.out.println("No");
        }else{
            System.out.println(A+" "+B2+" "+C);
        }
    }
}