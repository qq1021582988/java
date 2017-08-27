package checkLamda;

import java.awt.*;

/**
 * Created by Administrator on 2017/7/26.
 */
public class a implements inter{

    @Override
    public void run() {

    }

    @Override
    public void aaa() {
        System.out.println("you");
    }

    public void x(inter i){
        i.run();
    }
    public static void main(String[] args){
      a b =new a();
      new a().x(()->{
          b.aaa();
      });
    }
}
