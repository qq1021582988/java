package map;

import hell.employee;

import java.util.*;

/**
 * Created by Administrator on 2017/8/2.
 */
public class MapTest {
    public class entry<T>{

    }
    public static void main(String[] args){
//        Map<String, String> staff=new HashMap<>();
//        staff.put("1","Vincent");
//        staff.put("2","James");
//        staff.put("3","George");
//        staff.put("4","Lin");
//        System.out.println(staff);
//        System.out.println(staff.get("4"));
//        staff.forEach((k,v)-> System.out.println("key="+k+",value="+v));
//        Set<Map.Entry<String,String>> entry=staff.entrySet();
//        Iterator<Map.Entry<String,String>> it=entry.iterator();

        List<Integer> staff=new ArrayList<>();

        staff.add(1);
        staff.add(1);
        staff.add(1);
        staff.add(1);

        System.out.println(staff);
        List group=staff.subList(1,2);
        System.out.println(group);
        group.clear();
        System.out.println(group);
        System.out.println(staff);
    }

}
