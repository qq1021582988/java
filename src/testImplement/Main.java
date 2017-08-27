package testImplement;

/**
 * Created by Administrator on 2017/8/1.
 */
public class Main implements impl1,impl2
{
    @Override
    public void func1() {
        System.out.println("1");
    }

    @Override
    public void func2() {
        System.out.println("2");
    }
    public static void main(String[] args){
        impl1 demo1=new Main();

    }
}
