package Hashing;
import java.util.*;
//import java.util.HashSet;
//import java.util.HashMap;
//import java.util.Iterator;
public class Hash {
    public static void main(String[] args) {
//        HashSet<Integer> set = new HashSet<>();
//insert
        HashMap<String,Integer> map = new HashMap<>();
        map.put("India",120);
        map.put("China",150);
        map.put("SA",130);
        System.out.println(map); //it works an unorderd method
        map.put("India",130);
        System.out.println(map);
//        insert
if(map.containsKey("China")){
    System.out.println("present");
}
//for getting the value
        System.out.println(map.get("China"));
      for(Map.Entry<String,Integer> e:map.entrySet()){
    System.out.println(e.getKey());
    System.out.println(e.getValue());
}
//Second method
        Set<String> keys = map.keySet();
       for(String key:keys){
    System.out.println(key + " " + map.get(key));
}
       map.remove("China");
        System.out.println(map);








//        Hashset
//        set.add(1);
//        set.add(2);
//        set.add(7);
//        System.out.println( "size of set is "+set.size());
//        System.out.println(set);
//        //search-->contain
//        if(set.contains(1)){
//            System.out.println("true");
//        }
//        if(!set.contains(5)){
//            System.out.println("false");
//        }
////delete
//        set.remove(1);
//            if(!set.contains(1)){
//                System.out.println("false");
//            }
//            //iterator
//        Iterator it =set.iterator();
//            while(it.hasNext()){
//                System.out.println(it.next());
//
//        }

        }
    }

