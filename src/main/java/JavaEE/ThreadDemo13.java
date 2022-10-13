package JavaEE;

/**
 * @title: ThreadDemo13
 * @Author Xu
 * @Date: 2022/9/11 21:38
 * @Version 1.0
 */
public class ThreadDemo13 {
    public static void main(String[] args) {
        DeadLock deadLock = new DeadLock();
        Thread t1 = new Thread(deadLock);
        Thread t2 = new Thread(deadLock);
        t1.start();
        t2.start();

    }
}

class DeadLock implements Runnable {
    //创建两个Object对象：lock1和lock2。这两个lock作为同步代码块的锁；
    Object lock1 = new Object();
    Object lock2 = new Object();
    public boolean flag = true;

    @Override
    public void run() {
        if (flag) {
            flag = false;
            synchronized (lock1) {
                System.out.println(Thread.currentThread().getName() + "锁住资源lock1，等待lock2");
                try {
                    Thread.sleep(100);
                    //为了防止线程1启动一下子就连续获得了lock1和lock2两个对象的对象锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock2) {
                    System.out.println(Thread.currentThread().getName() + "得到lock2");
                }
            }
        } else {
            flag = true;
            synchronized (lock2) {
                System.out.println(Thread.currentThread().getName() + "锁住资源lock2，等待lock1");
                try {
                    Thread.sleep(100);
                    //为了防止线程1启动一下子就连续获得了lock1和lock2两个对象的对象锁
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (lock1) {
                    System.out.println(Thread.currentThread().getName() + "得到lock1");
                }

            }
        }

    }
}