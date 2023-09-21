package anonymous_demo;

/**
 * Let's see how anomoyous classes work for
 * interfaces.
 */

interface A {
    void show();
}

// class B implements A {
// public void show() {
// System.out.println("Im the best");
// }
// }

public class demo2 {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("Is the best");
            }
        };
        obj.show();
    }
}
