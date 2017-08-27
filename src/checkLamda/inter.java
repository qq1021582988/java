package checkLamda;

/**
 * Created by Administrator on 2017/7/26.
 */
public interface inter {
    default void aaa(){
        System.out.println("fuck");
    }
    public abstract void run();
}
