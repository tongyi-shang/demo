package 线程;

/**
 * 实现可以继承别的类
 */
public class 线程的三种方法2 implements Runnable{
    public static void main(String[] args) {
        Thread t=new Thread(new 线程的三种方法2());
        t.start();
    }

    @Override
    public void run() {

    }
}
