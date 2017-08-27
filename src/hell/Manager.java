package hell;

/**
 * Created by Administrator on 2017/7/30.
 */

public class Manager extends employee implements Cloneable{
    public Manager(String name, double salary) {
        super(name, salary);
    }

    public void fuck(){
        Manager man=new Manager("joy",2000);


    }
}