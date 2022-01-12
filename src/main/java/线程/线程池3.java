package 线程;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个单线程化的Executor，即只创建唯一的工作者线程来执行任务，它只会用唯一的工作线程来执行任务，
 * 保证所有任务按照指定顺序(FIFO, LIFO,优先级)执行。如果这个线程异常结束，会有另一个取代它，
 * 保证顺序执行。单工作线程最大的特点是可保证顺序地执行各个任务，并且在任意给定的时间不会有多个线程是活动的。
 */
public class 线程池3 {
    public static void main(String[] args) {
        //创建一个线程池
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i=0;i<10;i++){
            final int index=i;
            executorService.execute(()->{
                System.out.println(index);
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executorService.execute(()->{
                System.out.println("第二"+index);
            });
        }
    }
}
