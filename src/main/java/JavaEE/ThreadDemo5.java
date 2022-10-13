package JavaEE;

/**
 * @title: ThreadDemo5
 * @Author Xu
 * @Date: 2022/7/29 0:40
 * @Version 1.0
 * lambda 表达式创建 Runnable 子类对象
 */
public class ThreadDemo5 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();   //获取当前线程
        System.out.println("线程名称:" + thread.getName());
        Thread thread2 = new Thread(() -> {
            Thread thread1 = Thread.currentThread();   //获取当前线程
            System.out.println("线程名称:" + thread1.getName());
        });
        thread2.start();
    }
}