package interface_demo;

/**
 * Types of interface :
 * 1] Normal --> more than one method
 * 2] Single abstract method interface. --> one method only
 * --> Functional Interface --> Lambda Expression --> Scala.
 * 3] Marker interface. --> doesn't have any method.
 * 
 * We are trying to remove some boilplates we can assume.
 * 
 * It is similar to the arrow function we see in javascript.
 */

@FunctionalInterface
interface Abc {
    void show();
}

public class demo3 {
    public static void main(String[] args) {

        // This below stuff is called lambda expression and this is possible only
        // through functional interfaces.
        Abc obj = () -> System.out.println("Im the best");
        obj.show();
    }
}
