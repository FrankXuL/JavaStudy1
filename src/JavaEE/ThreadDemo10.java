package JavaEE;

/**
 * @title: ThreadDemo10
 * @Author Xu
 * @Date: 2022/9/10 19:21
 * @Version 1.0
 */
public class ThreadDemo10 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            MyThread10 A = new MyThread10("A");
            MyThread10 B = new MyThread10("B");
            MyThread10 C = new MyThread10("C");
            A.start();
            A.join();
            B.start();
            B.join();
            C.start();
            C.join();
            System.out.println();
        }
    }
}

class MyThread10 extends Thread {
    public String string;
    public MyThread10(String string){
        this.string = string;
    }
    @Override
    public void run() {
        System.out.print(string);
    }
}