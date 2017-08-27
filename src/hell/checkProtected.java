package hell;

/**
 * Created by Administrator on 2017/7/27.
 */
public class checkProtected {
    protected int i=100;
    public static void main(String[] args){

    }
}
class son extends checkProtected{
    public void fun(){
        System.out.println(i);
    }
}
class grandson extends son{
    public void func(){
        System.out.println(i);
    }
}
