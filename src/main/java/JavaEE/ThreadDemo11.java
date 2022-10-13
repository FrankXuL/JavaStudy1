package JavaEE;

/**
 * @title: ThreadDemo11
 * @Author Xu
 * @Date: 2022/9/10 19:28
 * @Version 1.0
 */
public class ThreadDemo11 {
    public static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    for (int i = 0; i < 10000; i++) {
                        count++;
                    }
                }
            }
        });
        t1.start();
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (this) {
                    for (int i = 0; i < 10000; i++) {
                        count++;
                    }
                }
            }
        });
        t2.start();
        t1.join();
        t2.join();
        System.out.println(count);
    }
}
