package JavaSE.pay;

import JavaSE.pay.pay;

import java.util.Scanner;

/**
 * @title: Test
 * @Author Xu
 * @Date: 13/11/2022 下午 7:21
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        pay pay = new pay();
        Scanner scanner = new Scanner(System.in);
        System.out.print("每小时工资为:");
        pay.price = scanner.nextDouble();
        System.out.print("扣缴率为:");
        pay.WithHoldRate = scanner.nextDouble();
        System.out.print("工资率为:");
        pay.PayRate = scanner.nextDouble();
        System.out.print("工作小时为:");
        double n = scanner.nextDouble();
        pay.PayMent = n * pay.ComputerPayment(pay.price, pay.WithHoldRate, pay.PayRate);
        System.out.println("当每小时工资为:" + pay.price + "工资率为:" + pay.PayRate + "扣缴率为:" + pay.WithHoldRate + "的应付工资为:" + pay.PayMent);
        pay.PayMent = n * pay.ComputerPayment(pay.price, pay.PayRate);
        System.out.println("当每小时工资为:" + pay.price + "工资率为:" + pay.PayRate + "的应付工资为:" + pay.PayMent);
        pay.PayMent = n * pay.ComputerPayment(pay.price);
        System.out.println("当每小时工资为:" + pay.price + "的应付工资为:" + pay.PayMent);
    }
}