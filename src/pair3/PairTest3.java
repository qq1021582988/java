package pair3;


import hell.Manager;
import hell.employee;

/**
 * Created by Administrator on 2017/7/30.
 */
public class PairTest3 {
    public static void main(String[] args) {
        System.out.println(Pair.class.getName());
    }

    public static void printBuddies(Pair<? extends employee> p) {
        employee first = p.getFirst();
        employee second = p.getSecond();
        System.out.println(first.getName()+" and"+second.getName()+" are buddies.");
    }

    public static void minmaxBonus(Manager[] a, Pair<? super Manager> result){
        if(a.length==0) return;
        Manager min=a[0];
        Manager max=a[0];
        for(int i=1;i<a.length;i++){
            if(min.getSalary()>a[i].getSalary())min=a[i];
            if(max.getSalary()>a[i].getSalary())max=a[i];

        }
        result.setFirst(min);
        result.setSecond(max);



    }

}




