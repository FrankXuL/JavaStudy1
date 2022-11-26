package JavaEE.java106;

/**
 * @title: ThreadDemo2
 * @Author Xu
 * @Date: 25/11/2022 下午 9:04
 * @Version 1.0
 */
public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {

        for(int i = 0; i < 20; i++){
            int j = i;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName());
                }
            });
            thread.start();
            thread.join();
        }
        System.out.println("ok");
    }

}