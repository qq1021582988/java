package hell;


import com.sun.javafx.runtime.SystemProperties;

import java.io.Console;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.math.BigDecimal;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2017/7/12.
 */
public class xxx implements face{
    @Override
    public void a() {
        System.out.println("baby");
    }

    @Override
    public void b() {

    }
    int a=100;

    public xxx(int a){
        this.a=a;
    }
    public void start(){
         class yyy{
            public void func(){
                a=111;
            }
        }
        yyy y=new yyy();
        y.func();
    }
    public static void main(String[] args) {

       Class cl=xxx.class;
        try {
            Constructor co=cl.getDeclaredConstructor(new Class[]{int.class});
//            co.setAccessible(true);
            xxx x=(xxx)co.newInstance(new Object[]{100});
            x.a();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void lam(face func){
        func.a();
    }
}


class demo {

    void func() {
        System.out.println("fuck you");
    }
}
