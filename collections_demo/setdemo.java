package collections_demo;

import java.util.HashSet;
import java.util.Set;

/**
 * We learn about set interface.
 * Set helps us to store unique values in the
 * list.
 * 
 * Hashset (Unordered_map) or Treeset (Map) can be used.
 */

public class setdemo {
    public static void main(String[] args) {
        Set<Integer> values = new HashSet<>();

        values.add(5);
        values.add(6);
        values.add(9);

        for (int i : values) {
            System.out.println(i);
        }
    }
}
