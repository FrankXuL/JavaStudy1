package HeiMa.SingleTon;

import java.io.Serializable;

/**
 * @title: SingleTon5
 * @Author Xu
 * @Date: 26/11/2022 下午 9:07
 * @Version 1.0
 */
public class SingleTon5  implements Serializable {
    private static class Holder{
        static SingleTon5 INSTANCE = new SingleTon5();
    }
    private SingleTon5() {
        System.out.println("懒汉式-内部类");
    }

    public static SingleTon5 getInstance() {
        return Holder.INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod");
    }
}