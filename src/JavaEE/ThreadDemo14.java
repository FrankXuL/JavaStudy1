package JavaEE;

/**
 * @title: ThreadDemo14
 * @Author Xu
 * @Date: 2022/9/12 15:25
 * @Version 1.0
 */
public class ThreadDemo14 {
    public static ThreadDemo14 instance = null;

    public ThreadDemo14(){}

    public synchronized static ThreadDemo14 getInstance(){
        if(instance == null){
            synchronized (ThreadDemo14.class){
                if (instance == null){
                    instance = new ThreadDemo14();
                }
            }
        }
        return instance;
    }
}