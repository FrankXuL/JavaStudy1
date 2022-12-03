package JavaEE.java106;

/**
 * @title: ThreadDemo7
 * @Author Xu
 * @Date: 3/12/2022 下午 8:12
 * @Version 1.0
 */
public class ThreadDemo7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        },"C");
        Thread t2 = new Thread(()->{
            try {
                t1.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());

        },"B");
        Thread t3 = new Thread(()->{
            try {
                t2.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName());

        },"A");
        t1.start();
        t2.start();
        t3.start();
    }
    public static void main1(String[] args) throws InterruptedException {
        Object locker1 = new Object();
        Object locker2 = new Object();
        Thread t1 = new Thread(()->{
            synchronized (locker2){
                try {
                    locker2.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());
        },"A");
        Thread t2 = new Thread(()->{
            synchronized (locker1){
                try {
                    locker1.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName());
            synchronized (locker2){
                locker2.notify();
            }
        },"B");
        Thread t3 = new Thread(()->{
            System.out.println(Thread.currentThread().getName());
            synchronized (locker1){
                locker1.notify();
            }
        },"C");
        t2.start();
        t3.start();
        t1.start();
    }
}