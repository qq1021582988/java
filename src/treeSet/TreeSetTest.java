package treeSet;

import java.util.*;

/**
 * Created by Administrator on 2017/8/1.
 */
public class TreeSetTest {
    public static void main(String[] args){
        SortedSet<Item>parts=new TreeSet<>();
        parts.add(new Item("Toaster",1234));
        parts.add(new Item("Widget",4562));
        parts.add(new Item("Modem",9912));
        System.out.println(parts);

        NavigableSet<Item> sortByDescription=new TreeSet<>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);



    }
    public static void func1(){
        System.out.println("fuckou");
    }
    public static void func2(){
        System.out.println("fuckou");
    }
}
