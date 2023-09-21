package interface_demo;

/**
 * demo1
 * 
 * Interface is similar to abstract class or class.
 * Let's understand the difference between Pen and Pencil.
 * 
 * When we use class --> we use extends.
 * When we use interface --> we use implements.
 * 
 * To achieve multiple inhertiance.
 * 
 * Extend one class + and add multiple interface you want.
 * 
 * Imp Points :
 * 1] We can create a reference of interface , but not the actual object.
 * 2] In interface you can't define any method , you can only declare it.
 * 3] We can achieive multiple inhertiance.
 * 4] We can have multiple interfaces , but can't achieve multiple classes.
 * 5] All the method interfaces are by default public abstract.
 * 
 * Always trying to go for interfaces in dealing with problems.
 */
interface Writer {
    public abstract void write();
}

class Pen implements Writer {
    public void write() {
        System.out.println("In a Pen");
    }
}

class Pencil implements Writer {
    public void write() {
        System.out.println("In a Pencil");
    }
}

class Kit {
    // Passing object class as a parameter in the given method.
    public void doSomething(Writer p) {
        p.write();
    }
}

public class demo1 {
    public static void main(String[] args) {
        // Kit k = new Kit();
        // Pen p = new Pen();

        Kit k = new Kit();
        Writer pc = new Pencil();

        // Passing the pencil class to the method.
        k.doSomething(pc);
    }
}