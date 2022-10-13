package JavaEE;

/**
 * @title: ThreadDemo2
 * @Author Xu
 * @Date: 2022/7/29 0:34
 * @Version 1.0
 * 通过实现Runnable创建线程实例
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();   //获取当前线程
        System.out.println("线程名称:" + thread.getName());
        Thread thread1 = new Thread(new MyThread2());
        thread1.start();
    }
}

class MyThread2 implements Runnable {
    @Override
    public void run() {
        //业务代码
        Thread thread = Thread.currentThread();   //获取当前线程
        System.out.println("线程名称:" + thread.getName());
    }
}