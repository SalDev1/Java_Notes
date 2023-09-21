package abstract_demo;

/**
 * We are learning final keyword .
 * 
 * Final keyword can be used with variables, methods
 * and class.
 * 
 * 
 * Whenever we are assigning final keyword , we can't
 * make any more changes to it.
 * 
 * Use this in cases , when we want certain things not to be
 * changed.
 * 
 * But when you assigned it once , there is no chance in future where
 * you can reassign or modify it as the final keyword is attach to it.
 */
class A {
    final int i; // it becomes constant

    public A() {
        i = 10;
        // i = 19;
    }
}

// Second example of assigning final keyword to the method.
class B {
    public void show() {
        System.out.println("in show B");
    }
}

class C extends B {
    public void show() {
        System.out.println("in show C");
    }
}

public class learn_final {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.i);

        C obj1 = new C();
        obj1.show();
    }
}
