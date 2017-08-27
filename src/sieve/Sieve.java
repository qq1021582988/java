package sieve;

import java.util.BitSet;
import java.util.concurrent.SynchronousQueue;

/**
 * Created by Administrator on 2017/8/4.
 */
public class Sieve {
    public static void main(String[] args) {
        int n = 2000000;
        long start = System.currentTimeMillis();
        BitSet b = new BitSet(n + 1);
        int count = 0;
        int i;
        for (i = 2; i <= n; i++) {
            b.set(i);
        }
        i = 2;
        while (i * i <= n) {
            if (b.get(i)) {
                count++;
                int k = i * 2;
                while (k <= n) {
                    b.clear(k);
                    k += i;
                }
            }
            ++i;
        }
        for(;i<=n;++i){
            if(b.get(i)){
                ++count;
            }
        }
        long end= System.currentTimeMillis();
        System.out.println(count+" primes");
        System.out.println((end-start)+" milliseconds");
    }
}
