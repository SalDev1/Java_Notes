package collections_demo;

import java.util.Map;

/*
 * We learn about the map interface 
 * over here + map comparator too.
 * 
 * Hashmap --> synchorized
 * Hashset --> non-synchorized.
 */

public class mapdemo {
    public static void main(String[] args) {
        Map<String, String> map = new Hashmap<>();
        map.put("myName", "..Navin");
        map.put("actor", "John");
        map.put("ceo", "Marisa");
        map.put("actor", "Akshay");

        // System.out.println(map.get("actor1"));

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
    }
}
