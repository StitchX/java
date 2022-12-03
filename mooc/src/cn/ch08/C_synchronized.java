package cn.ch08;

public class C_synchronized {
    
    public static void main(String[] args) {
//        线程的不确定性：一条指令不具备原子性操作，在CPU看了是多条语句
        /*
        多线程同步
        同时运行的线程需要共享数据、
        就必须考虑其它线程的状态与行为，这时就需要实现同步
         */
//        final int NUM=5000;
//        Thread[] threads = new Thread[NUM];
//        for (int i=0; i<NUM;i++){
//            threads[i] = new Thread(){
//                public void run(){
//                    cnt++;
//                    try {
//                        Thread.sleep(1);
//                    }catch (InterruptedException e){}
//                }
//            };
//        }
//        for (int i=0;i<NUM;i++) threads[i].start();
//        try {
//            Thread.sleep(3000);
//        }catch (InterruptedException e){}
//        System.out.println("%d %b \n" ,cnt, cnt==NUM);




        /*
        Java引入了对象互斥锁的概念，来保证共享数据操作的完整性。
            每个对象都对应于一个monitor（监视器），它上面 一个称为“互斥锁
            （lock, mutex)”的标记，这个标记用来保证在任一时刻，只能有一个线程访问该对象。
            关键字synchronized 用来与对象的互斥锁联系。

        synchronized的用法    // 使得具有原子性和互斥性
            对代码片断：
                synchronized(对象){ 。。。。}
            对某个方法：
                synchronized 放在方法声明中，
                public synchronized void push(char c ){ 。。。。}
                相当于对synchronized(this), 表示整个方法为同步方法。
         */

//        Num num = new Num();
//        Thread counter1= new Counter(num);
//        Thread counter2 = new Counter(num);
//        for (int i=0; i<10;i++){
//            num.testEqual();
//            try {
//                Thread.sleep(100);
//            }catch (InterruptedException e){}
//        }

        Work w1=new Work(1);
        Work w2=new Work(2);
        Thread td1 = new Thread(()->{
            w1.doTaskWithCooperator(w2);
        });
        Thread td2 = new Thread(()->{
            w2.doTaskWithCooperator(w1);
        });
        td1.start();
        td2.start();

    }
}

class Num {
    private int x=0;
    private int y=0;
    synchronized void increase(){
        x++;
        y++;
    }
    synchronized boolean testEqual(){
        boolean ok = (x==y);
        System.out.println(x+","+y+":"+ok);
        return ok;
    }
}

/*
线程同步控制
    使用wait()方法可以释放对象锁
    使用notify()或notifyAll()可以让等待的一个或所有线程进入就绪状态
    Java里面可以将wait和notify放在synchronized里面，是因为Java是这样
    处理的：
        在synchronized代码被执行期间，线程调用对象的wait()方法，会释放对象锁标志，然后进入等待状态，
        然后由其它线程调用notify()或者notifyAll()方法通知正在等待的线程。
 */

//互相等待，造成死锁
class Work{
    int id;
    public Work(int id){
        this.id=id;
    }
    synchronized void doTaskWithCooperator(Work other){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){}
        synchronized (other){   // 两个对象都加上锁
            System.out.println("doing"+id);
        }
    }
}


/*
并发API中增加了更多的类
    JDK1.5中增加了更多的类，以便更灵活地使用锁机制
    java.util.concurrent.locks包
    Lock接口、ReentrantLock类
        lock() tryLock() unlock()
    ReadWriteLock接口、ReentrantReadWriteLock类
        .writeLock().lock(), .readLock().unlock()
 */