package JavaSE;

import java.util.Scanner;

/**
 * @title: Java10
 * @Author Xu
 * @Date: 2022/7/28 14:55
 * @Version 1.0
 * 编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”,密码错误,
 * 可以重新输 入，最多输入三次。三次均错，则提示退出程序
 */
public class java10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int key =16;
        int count =0;
        while (true){
            if (count > 2){
                System.out.println("程序已退出");
                break;
            }
            System.out.println("请输入密码");
            int password = scanner.nextInt();
            if (key == password){
                System.out.println("登陆成功");
            }else {
                System.out.println("密码错误");
                count++;
            }
        }
    }
}