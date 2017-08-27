package objectAnalyzer;

import hell.employee;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/7/25.
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args){
        ArrayList<Integer> squares=new ArrayList<>();
        for(int i=1;i<=5;i++){
            squares.add(i*i);
        }
        Object arr=new Object();

        System.out.println(new ObjectAnalyzer().toString(arr));
    }
}
class demo{

}
