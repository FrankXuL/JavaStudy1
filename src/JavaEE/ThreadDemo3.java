package JavaEE;

/**
 * @title: ThreadDemo3
 * @Author Xu
 * @Date: 2022/7/29 0:37
 * @Version 1.0
 * 继承Thread类，使用匿名内部类
 */
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();   //获取当前线程
        System.out.println("线程名称:" + thread.getName());
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();   //获取当前线程
                System.out.println("线程名称:" + thread.getName());
            }
        };
        thread1.start();
    }
}