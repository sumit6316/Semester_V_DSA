package Hash_Map;
import java.util.*;

public class HashMap_Demo {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        // put
        map.put("Sumit",89);
        map.put("Aman",94);
        map.put("Uday",96);
        map.put("Pragyan",90);
        map.put("Shiv",92);
        map.put("null",93);

        //print
        System.out.println(map);

        //conatins
        System.out.println(map.containsKey("Uday"));
        System.out.println(map.containsKey("Raju"));
        //get
        System.out.println(map.get("Sumit"));
        System.out.println(map.get("Raju"));

        //size
        System.out.println(map.size());

        //Looping for hash map
        Set<String> set = map.keySet();
        for(String key : set){
            System.out.println(key + " "+map.get(key));
        }
    }
}
