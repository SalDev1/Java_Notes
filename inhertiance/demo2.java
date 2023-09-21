package inhertiance;

/**
 * 
 * When we called a class inherting properties from the parent class
 * ,it will always called both the constructor of super
 * class and sub class.
 * 
 * Whenever you defined an object of subclass with
 * parametrized constructor it will always calls its
 * own parametrized constructor + default constrcutor
 * of super class.
 * 
 * 1] Why it is calling a default constructor ??
 * Every constructor in subclass has by default method
 * called super method
 * 
 * super() --> it calls the constructor of super class +
 * As it doesn't have any params by default , it always
 * calls the default constructor.
 * 
 * So , If you want paramterized constructor of super
 * class and not the default one , just pass the params
 * to the super method.
 */

class A {
    public A() {
        System.out.println("in A");
    }

    public A(int i) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        // super(5);
        super();
        System.out.println("in B");
    }

    public B(int i) {
        super(i);
        System.out.println("in B int");
    }
}

public class demo2 {
    public static void main(String[] args) {
        B b = new B();

        System.out.print(b);
    }
}
