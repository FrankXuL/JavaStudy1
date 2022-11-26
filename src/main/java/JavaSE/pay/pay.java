package JavaSE.pay;

/**
 * @title: pay
 * @Author Xu
 * @Date: 13/11/2022 下午 7:09
 * @Version 1.0
 */
public class pay {
    public double price;  //小时工资
    public double WithHoldRate; //扣缴率
    public double PayRate;  //工资率
    public double PayMent;  //应得工资



    public double ComputerPayment(double price, double WithHoldRate, double payRate) {
        return price * (1 - WithHoldRate) * (1 - payRate);
    }

    public double ComputerPayment(double price,double payRate) {
        return price * (1 - 0.15) * (1 - payRate);
    }
    public double ComputerPayment(double price) {
        return price * (1 - 0.15) * (1 - 0.0465);
    }
}