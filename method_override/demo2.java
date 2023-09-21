package method_override;

/**
 * 
 * How to create reference of super class + reference of sub class.
 * 
 * Learning Polymorphism
 * 1] Compile time polymorphism.
 * 2] Runtime time polymorphism.
 * 
 * 
 * Which show method to call --> Decided at runtime only
 * 
 * Runtime Polymorphism --> Method Overriding.
 * 
 * Every time we are changing the method with the given reference
 * it is called dynamic method dispatch.
 */

class D {
    public void show() {
        System.out.println("in D");
    }
}

class C extends D {
    public void show() {
        System.out.println("in C");
    }

    public void config() {
        System.out.println("config");
    }
}

class E extends D {
    public void show() {
        System.out.println("in E");
    }
}

public class demo2 {
    public static void main(String[] args) {
        // You can use the reference of D (super class) to create an object of
        // class B. (sub class)
        D obj = new C(); // runtime polymorphism
        obj.show();
        // obj.config(); // Config is defined in sub class C , not in super class D.

        obj = new E();
        obj.show();
    }
}