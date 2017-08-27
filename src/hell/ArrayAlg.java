package hell;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;

/**
 * Created by Administrator on 2017/7/23.
 */
public class ArrayAlg {
    int a;
    
    public static void main(String[] args){
        ArrayAlg a=new ArrayAlg();
        double[] d=new double[20];
        for(int i=0;i<20;i++){
            d[i]=Math.random()*100;
            System.out.println(d[i]);
        }
        ArrayAlg.Pair pair=ArrayAlg.minmax(d);
        System.out.println(pair.getFirst()+"  "+pair.getSecond());


    }
    public static class Pair{
        private double first;
        private double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }
    }
    public static Pair minmax(double[] d){
        double min= Double.POSITIVE_INFINITY;
        double max= Double.NEGATIVE_INFINITY;
        for(double e : d){
            if(e<min) min=e;
            if(e>max) max=e;
        }
        return new Pair(min,max);
    }
}
