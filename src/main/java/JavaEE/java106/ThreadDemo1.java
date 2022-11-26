package JavaEE.java106;

/**
 * @title: ThreadDemo1
 * @Author Xu
 * @Date: 22/11/2022 下午 4:36
 * @Version 1.0
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        //1.继承Thread类,重写run方法
        Thread thread = new MyThread();
        thread.start();
        //2.使用匿名内部类继承Thread类,重写run方法
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类继承Thread类,重写run方法");
            }
        };
        thread1.start();
        //3.实现Runnable接口,重写run方法
        Runnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
        //4.使用匿名内部类实现Runnable接口,重写run方法
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("使用匿名内部类实现Runnable接口,重写run方法");
            }
        });
        thread3.start();
        Thread thread4 = new Thread(() ->{
            System.out.println("使用lambda表达式");
        });
        thread4.start();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("继承Thread类,重写run方法");
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("实现Runnable接口,重写run方法");
    }
}
