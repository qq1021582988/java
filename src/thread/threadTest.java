package thread;


import com.sun.org.apache.bcel.internal.generic.LADD;
import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.concurrent.atomic.AtomicLong;

import static java.lang.Thread.State.NEW;
import static java.lang.Thread.State.RUNNABLE;

/**
 * Created by Administrator on 2017/8/4.
 */
public class threadTest {

    public static AtomicLong nextNumber=new AtomicLong();
    private volatile long value;
    public static void main(String[] args) {


        Thread thread = new Thread(() -> {
            long id = nextNumber.incrementAndGet();
            id=nextNumber.incrementAndGet();
            id=nextNumber.incrementAndGet();
            long z=3L;
            System.out.println(id);
            z=nextNumber.updateAndGet(x->Math.max(x,10));
            System.out.println(z);


        });
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();

    }
}
