package HeiMa.SingleTon;

import java.io.Serializable;

/**
 * @title: SingleTon4
 * @Author Xu
 * @Date: 26/11/2022 下午 8:33
 * @Version 1.0
 */
public class SingleTon4 implements Serializable {
    private static volatile SingleTon4 INSTANCE = null;

    private SingleTon4() {
        System.out.println("DCL懒汉式");
    }


    public static SingleTon4 getInstance() {
        if (INSTANCE == null) {
            synchronized (SingleTon3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingleTon4();
                }
            }
        }
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod");
    }
}