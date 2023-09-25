package collections_demo;

/*
 * In this , we learn about comparator object 
 * and comparator class.
*/

public class demo4 {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(404);
        values.add(908);
        values.add(639);
        values.add(265);

        // If I want to add my own sorting logic ,
        // use a comparator object , below is one of the example.

        // Comparator is a functional interface and
        // we can use the lambda expression.

        Comparator<Integer> c = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10) {
                    return 1;
                } else {
                    return -1;
                }
            }
        };

        Comparator<Integer> c = (i,j) -> {(i%10>j%10) ? 1 : -1;
        Collection.sort(values, c);

        for (Integer o : values) {
            System.out.println(o);
        }
    }
}
