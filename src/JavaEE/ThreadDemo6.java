package JavaEE;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @title: ThreadDemo6
 * @Author Xu
 * @Date: 2022/7/29 0:44
 * @Version 1.0
 * 带返回值的 Callable
 */
public class ThreadDemo6 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // 创建 Callable 实例
        MyCallable callable = new MyCallable();
        // 用于接收 Callable 结果的对象
        FutureTask<Integer> futureTask = new FutureTask<Integer>(callable);
        // 创建新线程
        Thread thread = new Thread(futureTask);
        // 启动线程
        thread.start();
        // 接收新线程执行的结果
        int result = futureTask.get();
        System.out.println(Thread.currentThread().getName() +
                "——新线程返回的结果为：" + result);
    }
}

class MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        // 生成随机数：0-9
        int randomNum = new Random().nextInt(10);
        System.out.println(Thread.currentThread().getName() +
                "——随机数：" + randomNum);
        return randomNum;
    }
}