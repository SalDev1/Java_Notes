package interface_demo;

/*
 * We are learning about default method interface.
 * 
 * Abstract --> define and declare 
 * Interface --> declare
 * 
 * I can only create a reference of the interface , not the actual object.
 * 
 * In an interface we can't define a method , but using default keyword 
 * we can achieve it.
 * 
 * In functional interface , you can have any number of default methods 
 * and only one single abstract method.
 * 
 * We also understand multiple inhertiance issue with interface.
 * 
 * Due to the default methods and interfaces , we are getting the ambuigity 
 * issues, to solve it we have two soluitions : 
 * 1] Calling super interface method. 
 * 2] Overriding the default method in the subclass.
 */
@FunctionalInterface
interface Demo {
    void abc();

    default void show() {
        System.out.println("in show");
    }
}

interface MyDemo {
    default void show() {
        System.out.println("In myDemo show");
    }
}

class DemoImp implements Demo, MyDemo {
    public void abc() {
        System.out.println("in abc");
    }

    // 1st way of dealing with the problem.
    // public void show() {
    // System.out.println("In DemoImp show");
    // }

    // If you want to specific used a show method from specific
    // super class , this is what you have to do.
    @Override
    public void show() {
        MyDemo.super.show();
    }
}

public class demo4 {
    public static void main(String[] args) {

        Demo obj = new DemoImp();
        obj.abc();
        obj.show();
    }
}
