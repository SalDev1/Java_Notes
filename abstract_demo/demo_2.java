package abstract_demo;

/*
 * 
 * Using Number data type , it helps you 
 * deal with different types of number. 
 * 
 * Number is a super class and it is an 
 * advantage of using super class as a reference. 
 * to handle different data types.
 */

// Another example of abstraction.
abstract class Writer {

}

class Pen extends Writer {

}

class Pencil extends Writer {

}

class Printer {
    // public void show(Integer i) {
    // System.out.println(i);
    // }

    // public void show(Double i) {
    // System.out.println(i);
    // }

    public void show(Number i) {
        System.out.println(i);
    }
}

public class demo_2 {
    public static void main(String[] args) {
        Printer obj = new Printer();
        obj.show(5.5);
    }
}
