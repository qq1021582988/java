package methods;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/7/26.
 */
public class MethodTableTest {
    public static void main(String[] args){
//        Method square=
    }

    public static double square(double x)
    {
        return x*x;
    }

    public static void printTable(double from,double to,int n,Method f){
        System.out.println(f);
        double dx=(to-from)/(n-1);
        for(double x=from;x<=to;x+=dx){
            
        }
    }
}
