package 线程;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * newFixedThreadPool
 * 创建一个指定工作线程数量的线程池。每当提交一个任务就创建一个工作线程，如果工作线程数量达到线程池初始的最大数，
 * 则将提交的任务存入到池队列中。
 *
 * FixedThreadPool是一个典型且优秀的线程池，它具有线程池提高程序效率和节省创建线程时所耗的开销的优点。但是，
 * 在线程池空闲时，即线程池中没有可运行任务时，它不会释放工作线程，还会占用一定的系统资源。
 * 因为线程池大小为3，每个任务输出index后sleep 2秒，所以每两秒打印3个数字。
 * 定长线程池的大小最好根据系统资源进行设置如Runtime.getRuntime().availableProcessors()。
 */
public class 线程池2 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        System.out.println(Runtime.getRuntime().availableProcessors());
        for (int i=0;i<10;i++){
            final int index=i;
            executorService.execute(
                    ()->{
//                public void run() {
                    try {
                        Thread.sleep(  2000);
                        System.out.println(index+"===="+Thread.currentThread().getId());

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                }
            });
        }
    }
}
