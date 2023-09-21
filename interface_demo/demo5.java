package interface_demo;

/**
 * 
 * Using Static Keyword in interface.
 * We don't need objects to call static method.
 */
@FunctionalInterface
interface Demo {
    final int i = 5; // Declaring a variable inside a variable becomes constant.

    void abc();

    static void show() {
        System.out.println("hi");
    }
}

class DemoImp implements Demo {
    public void abc() {
        // i = 9;
    }
}

public class demo5 {
    public static void main(String[] args) {
        Demo.show();
    }
}
