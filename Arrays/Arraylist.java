package Arrays;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(90);
        list.add(0,-9);
        System.out.println(list);
        System.out.println(list.get(3)); //index
        System.out.println(list.remove(2));
        System.out.println(list);
        list.set(1,-4);
        System.out.println(list);


    }
}
