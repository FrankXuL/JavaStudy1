package JavaSE;

/**
 * @title: java4
 * @Author Xu
 * @Date: 2022/7/27 15:44
 * @Version 1.0
 * 编写程序数一下 1到 100 的所有整数中出现多少个数字9
 */
public class java4 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i =1; i <= 100;i++){
            if(i%10==0){
                sum++;
            }
            if(i/10 ==9){
                sum++;
            }
        }
        System.out.println(sum);
    }
}