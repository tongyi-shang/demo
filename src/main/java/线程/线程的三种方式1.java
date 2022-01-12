package 线程;

/**
 * 继承，不可以继承别的类
 * 方便操作
 */
public class 线程的三种方式1  extends Thread{
    @Override
    public void run() {
        for (int i=0;i<100;i++){
            System.out.println(currentThread().getName()+"i");
        }
    }

    public static void main(String[] args) {
        for (int i =0 ;i<100;i++){
            System.out.println(currentThread().getName()+"i");
            if (i==20){
                new 线程的三种方式1().start();
                new 线程的三种方式1().start();

            }
        }
    }

}
