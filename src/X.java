import hell.face;

import java.util.*;
import java.util.concurrent.Future;

/**
 * Created by Administrator on 2017/7/12.
 */

/**
 * @version 111
 * @author shen
 *
 *
 */
public class X implements face {
    @Override
    public void a() {

    }

    @Override
    public void b() {

    }

    public static void func(int a, int b){
        System.out.println(a+b);
    }

    public static void main(String[] args){
        LinkedList<Integer> arr=new LinkedList<>();
        for(int i=0;i<3;i++){
            arr.add(i);
        }
        Iterator<Integer> integerIterator=arr.iterator();
        while(integerIterator.hasNext()){
            integerIterator.next();
            integerIterator.remove();
        }

        System.out.println(integerIterator.hasNext());
        if(arr instanceof RandomAccess){
            System.out.println("yes");
        }
    }
}

