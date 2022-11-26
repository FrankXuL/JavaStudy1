package HeiMa.SingleTon;

/**
 * @title: SingleTon2
 * @Author Xu
 * @Date: 26/11/2022 下午 8:23
 * @Version 1.0
 */
public enum SingleTon2 {
    INSTANCE;

    private SingleTon2() {
        System.out.println("饿汉式");
    }

    public static SingleTon2 getInstance() {
        return INSTANCE;
    }

    public static void otherMethod() {
        System.out.println("otherMethod");
    }
}
