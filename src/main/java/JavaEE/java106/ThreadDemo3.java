package JavaEE.java106;

import lombok.Synchronized;

/**
 * @title: ThreadDemo3
 * @Author Xu
 * @Date: 29/11/2022 下午 7:35
 * @Version 1.0
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Object lock1 = new Object();
        Object lock2 = new Object();
        Thread t1 = new Thread(() ->{
            synchronized (lock1){
                System.out.println("t1获取到lock1，等待获取lock2");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2){
                    System.out.println("t1获取到lock2");
                }
            }

        });
        Thread t2 = new Thread(() ->{
            synchronized (lock2){
                System.out.println("t2获取到lock2，等待获取lock1");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1){
                    System.out.println("t2获取到lock1");

                }
            }

        });
        t1.start();
        t2.start();
    }
}