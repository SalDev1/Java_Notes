package abstract_demo;

/**
 * Use Abstract in the class + can use abstract in the method as well.
 * 
 * Why do we need Abstract Class ?
 * 
 * Suppose a certain class will be used by its sub class inherting its
 * properties and methods , that's where we can use abstract keyword.
 * 
 * Abstraction --> The concept to use to hide certain information from
 * the public.
 * 
 * Abstract assigned on the class --> can't create an object of it.
 * 
 * If you need abstract method , you need your class to be abstract.
 */
abstract class Human {
    public abstract void eat();

    public void walk() {

    }
}

/*
 * When extending an abstract class , make sure that the abstract method
 * is been called.
 */
class Man extends Human {
    public void eat() {

    }
}

public class demo_1 {
    public static void main(String[] args) {
        // I can refer Man as Human , I can refer Women as Human.
        Human obj = new Man();
    }
}
