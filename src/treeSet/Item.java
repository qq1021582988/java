package treeSet;

import java.util.*;

/**
 * Created by Administrator on 2017/8/1.
 */
public class Item implements Comparable<Item> {
    @Override
    public int compareTo(Item o) {
        int diff = Integer.compare(partNumber, o.partNumber);
        return diff != 0 ? diff : description.compareTo(o.description);
    }
    public static void main(String[] args){
        List<Integer> arr=new LinkedList<>();
        arr.add(1);
        arr.add(1);
        arr.add(2);
        arr.add(1);
        arr.add(1);

        Collections.sort(arr);
        System.out.println();
    }
    private String description;
    private int partNumber;

    public Item(String description, int partNumber) {
        this.description = description;
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Item{" +
                "description='" + description + '\'' +
                ", partNumber=" + partNumber +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (partNumber != item.partNumber) return false;
        return description != null ? description.equals(item.description) : item.description == null;

    }

    @Override
    public int hashCode() {
        int result = description != null ? description.hashCode() : 0;
        result = 31 * result + partNumber;
        return result;
    }

}
