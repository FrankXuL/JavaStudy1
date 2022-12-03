package JavaEE.java106;

/**
 * @title: ThreadDemo5
 * @Author Xu
 * @Date: 29/11/2022 下午 8:00
 * @Version 1.0
 */
public class ThreadDemo5 {
    public static void main(String[] args) {
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10000; i++) {
                    counter.count++;
                }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 10000; i++) {
                    counter.count++;
                }
            }
        });
        t1.start();
        t2.start();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.count);
    }
}

class counter {
    static int count = 0;
    public void increase() {
        count++;
    }
}