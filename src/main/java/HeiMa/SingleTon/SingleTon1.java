package HeiMa.SingleTon;

/**
 * @title: SingleTon1
 * @Author Xu
 * @Date: 26/11/2022 下午 8:20
 * @Version 1.0
 */
public class SingleTon1 {
    private static final SingleTon1 INSTANCE = new SingleTon1();

    private SingleTon1() {
        System.out.println("饿汉式");
    }

    public static SingleTon1 getInstance() {
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod");
    }
}