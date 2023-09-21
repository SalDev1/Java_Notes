package static_demo;

/**
 * demo1
 * 
 * If you want some variables not be object
 * specific , make it static.
 * 
 * Making static , this variable will be same for all object or
 * all the object are sharing the same value.
 * 
 * It is not compulsory to use any object name for handling
 * static variables , you can also use the Class name itself to]
 * handle it.
 * 
 * When you want to initialize or predefine non static variable
 * --> Use Constructor.
 * 
 * When you want to initialize or predefine static variable
 * --> Use Static Block.
 * 
 * You can't assign a non static variable inside a static method.
 */
class Emp {
    int eid;
    int salary;
    static String ceo; // goes into classloader memory.

    static { // It is executed when you load a class , it will load only once.
        ceo = "Harry";
        System.out.println("in static");
    }

    public Emp() { // It is executed when we create an object , you can create new objects every
                   // time.
        eid = 1;
        salary = 3000;
        System.out.println("in constructor");
    }

    public void show() {
        System.out.println(eid + " : " + salary + " : " + ceo);
    }
}

public class demo1 {
    public static void main(String[] args) {
        Emp e1 = new Emp();

        e1.eid = 8;
        e1.salary = 4000;
        e1.ceo = "Salman";

        Emp e2 = new Emp();

        e2.eid = 112;
        e2.salary = 10000;
        e2.ceo = "Angel";

        e1.ceo = "Noob";

        e1.show();
        e2.show();
    }
}