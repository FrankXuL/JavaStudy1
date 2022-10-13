package JavaEE;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * @title: ThreadDemo8
 * @Author Xu
 * @Date: 2022/8/29 21:46
 * @Version 1.0
 * 实现一个定时器
 */
public class ThreadDemo8 {
    //使用Task类来描述任务
    static class Task implements Comparable<Task> {
        private Runnable command;
        private long time;

        public Task(Runnable command, long time) {
            this.command = command;
            //保存一个绝对时间(毫秒级时间戳)
            this.time = System.currentTimeMillis() + time;
        }

        public void run() {
            command.run();
        }

        @Override
        public int compareTo(Task o) {
            return (int) (this.time - o.time);
        }
    }

    static class Timer {
        private PriorityBlockingQueue<Task> queue = new PriorityBlockingQueue<>();
        private Object locker = new Object();

        public void schedule(Runnable command, long delay) {
            Task task = new Task(command, delay);
            queue.put(task);

            //每次插入一个任务唤醒扫描线程，重新计算线程wait时间
            synchronized (locker) {
                locker.notify();
            }
        }

        public Timer() {
            Thread t = new Thread() {
                @Override
                public void run() {
                    while (true) {
                        try {
                            Task task = queue.take();
                            long curTime = System.currentTimeMillis();
                            if (curTime < task.time) {
                                queue.put(task);
                                synchronized (locker) {
                                    locker.wait(task.time - curTime);
                                }
                            } else {
                                task.run();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                            break;
                        }
                    }
                }
            };
            t.start();
        }

    }

    public static void main(String[] args) {
        System.out.println("start");
        Timer timer = new Timer();
        timer.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello");
            }
        },4000);
    }
}