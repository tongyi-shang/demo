package 线程;

/**
 * 实现可以继承别的类
 */
public class 线程的三种方法2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i<100; i++){
            System.out.println(Thread.currentThread().getName()+i);
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+i);
            if (i==20){
                线程的三种方法2 t=new 线程的三种方法2();
                new Thread(t,"线程1").start();
                new Thread(t,"线程2").start();
            }
        }
    }
}
