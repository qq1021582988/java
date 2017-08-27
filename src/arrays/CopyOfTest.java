package arrays;

import com.sun.javafx.runtime.SystemProperties;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by Administrator on 2017/7/26.
 */
public class CopyOfTest {
    public static void main(String[] args){
        int[] a={1,2,3};
        a=(int[])goodCopyOf(a,10);
        System.out.println(Arrays.toString(a));
        String[] b={"Tom","Dick","Harry"};
        b=(String[]) goodCopyOf(b,10);
        System.out.println(Arrays.toString(b));
        HashSet<String> staff=new HashSet<>();
        staff.add("1");
        staff.add("2");
        staff.add("3");
        staff.add("4");
        String[] value=staff.toArray(new String[10]);


    }

    public static Object goodCopyOf(Object a,int newLength){
        Class cl=a.getClass();
        if(!cl.isArray()) return null;
        Class componentType=cl.getComponentType();
        int length= Array.getLength(a);
        Object newArray=Array.newInstance(componentType,newLength);
        System.arraycopy(a,0,newArray,0,Math.min(length,newLength));
        return newArray;
    }



}
