package wrapper_class;

/**
 * 
 * The technique of putting the primitive variable inside of an object
 * is called boxing - wrapping.
 * 
 * ParseInt --> It is a static method.
 */

public class demo_1 {
    public static void main(String[] args) {
        int i = 5; // Primitive Datatype.
        Integer ii = new Integer(i); // Boxing - Wrapping.
        // Storing integer in a object , not in the variable.

        int j = ii.intValue(); // unboxing , unwrapping.

        Integer value = i; // AutoBoxing

        int k = value; // Auto - UnBoxing.

        String str = "123";

        // Converting string into number.
        int n = Integer.parseInt(str);
        System.out.println(n);
    }
}
