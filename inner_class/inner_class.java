package inner_class;

/**
 * 
 * It is possible to create inner class within or
 * inside of the class.
 * 
 * How do we make sure that the Inner Class is
 * related to the outer class.
 * 
 * Make use of the outer class object to get
 * access to the inner clas object.
 * See the example now below.
 * 
 * We can have static method , class and name using static keyword.
 */
class Outer {
    int a;

    public void show() {
    }

    // Called as Inner Class or Member Class.
    public class Inner { // Outer$Inner.class , when it is been complied.
        public void display() {
            System.out.println("In Display");
        }
    }
}

class Outer_1 {
    static int a;

    public static void show() {
    }

    // Called as Inner Class or Member Class.
    static class Inner { // Outer$Inner.class , when it is been complied.
        public void display() {
            System.out.println("In Display");
        }
    }
}

public class inner_class {
    public static void main(String[] args) {

        Outer obj = new Outer();
        obj.show();

        // To create a new object of Inner class , use obj name define for outer class.
        // (Right Side)
        // To use the inner class itself , use outer class name (Left Side).
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();
    }
}
