package inhertiance;

/**
 * Why Java doesn't support multiple inhertiance ?
 * 
 * Suppose you have class C.
 * and in main method , you have
 * 
 * c obj = new c();
 * obj.show();
 * 
 * Show method doesn't exist in the class C , so it
 * will give you error.
 * 
 * let's say we have class A and class B
 * Class B has show method
 * 
 * Class C inherit from Class A and B using extend keyword
 * and now your program runs perfectly.
 * 
 * This kind of situation is called ambiguity.
 * So using Class , you can't achieve multiple inhertiance in
 * java + due to ambiguity , Java prefers to remove classes.
 * 
 * Conculsion :- Using classes , you can't achive multiple inhertiance in
 * java.
 * 
 * But we can achieved it indirectly.
 */

public class demo3 {
    public static void main(String[] args) {

    }
}
