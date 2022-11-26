package HeiMa.SingleTon;

import java.io.Serializable;

/**
 * @title: SingleTon3
 * @Author Xu
 * @Date: 26/11/2022 下午 8:29
 * @Version 1.0
 */
public class SingleTon3 implements Serializable {
    private static  SingleTon3 INSTANCE = null;

    private SingleTon3() {
        System.out.println("懒汉式");
    }

    public static synchronized SingleTon3 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingleTon3();
        }
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod");
    }
}