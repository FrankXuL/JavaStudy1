package JavaEE;

import java.util.concurrent.LinkedBlockingQueue;

/**
 * @title: MyThreadPool
 * @Author Xu
 * @Date: 2022/8/22 22:32
 * @Version 1.0
 */
public class MyThreadPool {
    private int maxWorkerCount = 10;
    private LinkedBlockingQueue<Runnable> queue = new LinkedBlockingQueue();
    public void submit(Runnable command) throws InterruptedException {
        if (queue.size() < maxWorkerCount) {
        // 当前 worker 数不足, 就继续创建 worker
            Worker worker = new Worker(queue);
            worker.start();
        }
        // 将任务添加到任务队列中
        queue.put(command);
    }
    public static void main(String[] args) throws InterruptedException {
        MyThreadPool myThreadPool = new MyThreadPool();
        myThreadPool.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("吃饭");
            }
        });
        Thread.sleep(1000);
    }
}

class Worker extends Thread{
    private LinkedBlockingQueue<Runnable> queue = null;

    public Worker(LinkedBlockingQueue<Runnable> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (!Thread.interrupted()){
                Runnable runnable = queue.take();
                runnable.run();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}