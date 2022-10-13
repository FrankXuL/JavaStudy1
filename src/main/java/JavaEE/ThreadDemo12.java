package JavaEE;

/**
 * @title: ThreadDemo12
 * @Author Xu
 * @Date: 2022/9/10 19:39
 * @Version 1.0
 */
public class ThreadDemo12 {
    public static void main(String[] args) {

    }
}

//懒汉模式
class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance;
    }
}

//懒汉模式 单线程
class Singleton2 {
    private static Singleton2 instance = null;

    public Singleton2() {

    }

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}

//懒汉模式 多线程
class Singleton3 {
    private static Singleton3 instance = null;

    public Singleton3() {

    }

    public synchronized static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
        }
        return instance;
    }
}

//懒汉模式 多线程模式改进
class Singleton4 {
    public volatile static Singleton3 instance = null;

    public Singleton4() {

    }

    public synchronized static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}