package JavaEE;

/**
 * @title: ThreadDemo9
 * @Author Xu
 * @Date: 2022/9/10 19:11
 * @Version 1.0
 */
public class ThreadDemo9 {
    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 20; i++) {
//            Thread t = new MyThread();
//            t.start();
//            t.join();
//        }
//        System.out.println("OK");
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        });
        t.start();
        System.out.println("2");
    }
}

class MyThread extends Thread {
    private static int count = 0;

    @Override
    public void run() {
        System.out.println(count++);
    }
}
