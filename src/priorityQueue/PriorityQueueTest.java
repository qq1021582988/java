package priorityQueue;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Administrator on 2017/8/1.
 */
public class PriorityQueueTest {
    public static void main(String[] args){
        PriorityQueue<Integer> pq=new PriorityQueue<>((first,second)->{
            return Integer.compare(second,first);
        });
        pq.add(2);
        pq.add(23);
        pq.add(45);
        pq.add(65);
        pq.add(13);
        pq.add(24);
        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }
    }
}

