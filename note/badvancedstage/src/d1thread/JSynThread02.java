package d1thread;

/**
 * @author Eva   Email:
 * @Description 使用同步方法处理继承Thread类的方式中的线程安全问题
 * @data 2023/1/11 14:38
 */
public class JSynThread02 extends Thread{
    /*
    使用同步代码块解决继承Thread类的方式的线程安全问题
    说明：在继承Thread类创建多线程的方式中，慎用this充当同步监视器，考虑使用当前类充当同步监视器。
     */

    private static int ticket = 100;
    public static void main(String[] args) {
        JSynThread02 t1 = new JSynThread02();
        JSynThread02 t2 = new JSynThread02();
        JSynThread02 t3 = new JSynThread02();
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }

    @Override
    public void run() {
        while (true){
            show();
        }
    }

    public synchronized static void show(){ //同步监视器: JSynThread02.class
        if (ticket>0){
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+"窗口，当前票号为："+ticket);
            ticket--;
        }
    }
}
