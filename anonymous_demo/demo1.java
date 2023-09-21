package anonymous_demo;

class A {
    public void show() {
        System.out.println("in A show");
    }
}

class B extends A {
    public void show() {
        System.out.println("Im the best");
    }
}

// Let's say I don't wanna make changes to the class.
/**
 * One way of dealing with this , Is simply method
 * overriding with the given class.
 * 
 * Second way is creating anomoyous class given in the example
 * below.
 * 
 * In anomoyous class , we create the object and
 * then specify the implementation of it.
 */
public class demo1 {
    public static void main(String[] args) {
        A obj = new A() {
            public void show() {
                System.out.println("im the best");
            }
        };
        obj.show();
    }
}
