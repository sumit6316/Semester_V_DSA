package Hash_Map;

import java.util.*;

public class LinkedHashMap_Demo {

    public static void main(String[] args) {
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        // put
        map.put("Sumit",89);
        map.put("Aman",94);
        map.put("Uday",96);
        map.put("Pragyan",90);
        map.put("Shiv",92);
        map.put("null",93);

        //print
        System.out.println(map);
    }
}
