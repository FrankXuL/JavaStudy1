package JavaEE.java106;

/**
 * @title: ThreadDemo6
 * @Author Xu
 * @Date: 3/12/2022 下午 8:07
 * @Version 1.0
 */
public class ThreadDemo6 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        for (int i = 0; i < 10; i++) {
            Thread t1 = new Thread(() -> {
                System.out.print("A");
                synchronized (lock1) {
                    lock1.notify();
                }
            });
            Thread t2 = new Thread(() -> {
                synchronized (lock1) {
                    try {
                        lock1.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("B");
                synchronized (lock2) {
                    lock2.notify();
                }
            });
            Thread t3 = new Thread(() -> {
                synchronized (lock2) {
                    try {
                        lock2.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.print("C");
            });
            t2.start();
            t3.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            t1.start();
            System.out.println();
        }
    }
}