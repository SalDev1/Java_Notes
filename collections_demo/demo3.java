package collections_demo;

import java.util.Collections;

public class demo3 {
    public static void main(String[] args) {
        // List<Integer> values = new ArrayList<Integer>();

        List<Integer> values = new ArrayList<>(); // Mutable
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        Collections.sort(values);
        Collections.reverse(values);
        Collections.shuffle(values);

        for (Integer a : values) {
            System.out.println(a);
        }
    }
}
