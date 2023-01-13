package d1thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Eva   Email:
 * @Description 方式四：创建线程池
 * @data 2023/1/13 11:39
 */
public class QThreadPool implements Runnable{
    public static void main(String[] args) {
//        1. 提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);

//        2. 执行指定的线程的操作。需要提供实现Runnable接口或Callable接口实现类的对象
        service.execute(new QThreadPool());
//        service.submit(); // 适用于Callable

//        关闭连接池
        service.shutdown();

    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i%2==0) System.out.println(i);
        }
    }
}
