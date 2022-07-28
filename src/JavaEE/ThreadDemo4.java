package JavaEE;

/**
 * @title: ThreadDemo4
 * @Author Xu
 * @Date: 2022/7/29 0:39
 * @Version 1.0
 * 实现Runnable接口，创建匿名内部类
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();   //获取当前线程
        System.out.println("线程名称:" + thread.getName());
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread thread = Thread.currentThread();   //获取当前线程
                System.out.println("线程名称:"+thread.getName());
            }
        });
        thread1.start();
    }
}