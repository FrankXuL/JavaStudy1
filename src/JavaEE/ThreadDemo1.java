package JavaEE;

/**
 * @title: ThreadDemo1
 * @Author Xu
 * @Date: 2022/7/29 0:28
 * @Version 1.0
 * 通过继承Thread类创建线程实例
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread(); //获取当前线程
        System.out.println("线程名称:" + thread.getName());
        MyThread1 myThread1 = new MyThread1();   //创建MyThread1类的实例
        myThread1.start();
    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        //业务代码
        Thread thread = Thread.currentThread();   //获取当前线程
        System.out.println("线程名称:" + thread.getName());
    }
}
