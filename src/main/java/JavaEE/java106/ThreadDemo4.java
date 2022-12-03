package JavaEE.java106;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @title: ThreadDemo4
 * @Author Xu
 * @Date: 29/11/2022 下午 7:44
 * @Version 1.0
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr = new int[10000000];
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        AtomicInteger a = new AtomicInteger();
        Object lock1 = new Object();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 10000000; i++) {
                if (i % 2 == 0) {
                    a.addAndGet(arr[i]);
                }
            }
        });
        t1.start();
        Object lock2 = new Object();
        AtomicInteger b = new AtomicInteger();
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 10000000; i++) {
                if (i % 2 != 0) {
                    b.addAndGet(arr[i]);
                }
            }
        });
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int result = a.intValue() + a.intValue();
        System.out.println(a.intValue());
        System.out.println(a.intValue());
        System.out.println(result);
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }
}