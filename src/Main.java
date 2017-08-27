import hell.xxx;

import java.io.Console;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    protected int i = 1;

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String newline=in.nextLine();

//        Main one = new Main();
//        son two = new son();
//        System.out.println();
//        if(two instanceof Main){
//            System.out.println("yes");
//        }

//        System.out.println(passwd);
//        Scanner in =new Scanner(System.in);
//        int a=in.nextInt();
//        assert a==100:"wrong";Log4j
        

    }
    private static final Logger myLogger=Logger.getLogger("com.mycompany.myapp");
    public void func() {
        System.out.println(i);
    }
}

class son extends Main {
    public void func() {
        Main a = new son();
        System.out.println(100);
    }
}
