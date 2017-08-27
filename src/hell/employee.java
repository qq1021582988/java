package hell;




import javax.print.attribute.standard.MediaSize;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;


public class employee implements Comparable<employee>,face,Cloneable{
    public employee clone() throws CloneNotSupportedException{
        System.out.println("sb");
        return (employee)super.clone();
    }
    public static void main(String[] args) {
        employee[] a=new employee[2];
        a[0]=new employee("vincent",1000);
        a[1]=new employee("george",100);
        employee c=new employee("Jame",10);
        Object b=a;
        System.out.println(b.getClass());
//        a= Arrays.copyOf(a,2*a.length);
//        System.out.println(a.length);
//        System.out.println(a[2].getSalary());
    }





    public employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }


    private String name;
    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(employee o) {
        return Double.compare(salary, o.salary);
    }


    @Override
    public void a() {
       face.super.a();
        System.out.println("111111111111111");
    }

    @Override
    public void b() {

    }
    public void fuck(){
        System.out.println("fuck");
    }

    public String getName() {
        return name;
    }
}

class executive extends Manager{
    public executive(String name, double salary) {
        super(name, salary);
    }

}