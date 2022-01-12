import java.util.ArrayList;
import java.util.List;

/**
 * 线程不安全
 */
public class list集合 {
    public static void main(String[] args) {
        ThreadTrain1 thread = new ThreadTrain1();
        Thread thread1 = new Thread(thread,"窗口一");
        Thread thread2 = new Thread(thread,"窗口二");
        thread1.start();
        thread2.start();
    }

}
class ThreadTrain1 extends Thread{
    private int i=100;
    Object oj = new Object();
    @Override
    public void run() {
        while (i >0){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sale();
        }
    }
    public void sale(){
        synchronized(oj){
            System.out.println(Thread.currentThread().getName()+"出售第"+i+"章票");
            i--;
        }
    }
}