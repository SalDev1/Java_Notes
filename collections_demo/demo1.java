package collections_demo;

import java.util.AbtractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * 
 * We are learning about different collecitons including
 * Set, Map, ArrayList , Collection , List.
 * 
 * Over here we are learning how Collection works.
 */

public class demo1 {
    public static void main(String[] args) {
        Collection values = new ArrayList<>();
        values.add(4);
        values.add(6);
        values.add(9);

        // To print the values from the collection list.
        Iterator it = values.Iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
