package class_and_objects;

/**
 * class_1
 * 
 * An example to understand class and object
 * 
 * We know that A vehicle consists of wheels , frontlight
 * and backlight and it is used to build several types of vehicles
 * 
 * So, we can create a common template , in programming terms a class
 * to store this common features and methods and use them according to our needs
 * such as building a Car , Bike , SUV , Sedan , etc using the common template
 * called Vehicle.
 * 
 * There are many such real life examples.
 * 
 * Not assign any value to the variables and getting
 * calling them wil show you 0.
 */
class Calc {
    int a;
    int b;

    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int multi(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }
};

public class class_1 {
    public static void main(String[] args) {
        // Calc c = reference to the class.
        // new = allocating memory space for the object creating using class.
        // This is Java way of creating an object from the class.
        Calc c = new Calc(); // object knows something and does something.

        int res = c.add(1, 1);
        System.out.print(res);
    }
}

// Java in OOP in Nature.