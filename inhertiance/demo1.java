package inhertiance;

/**
 * 
 * Java also follows OOPS , which includes concepts such as.
 * Data Abstraction , Encapsulation , Inhertiance . etc
 * similar to C++.
 * 
 * Let's understand Inhertiance over here.
 * 
 * Understand it with the help of real life example.
 * 
 * The below example is a multi level inhertiance.
 * 
 * Java doesn't support multi-level inheritance.
 */

// IS-A , HAS-A
// Whenever a class extends another class , it is called IS-A. , dog is an
// animal , dog extends animal.
// Whenever a class creates an object of another class , it is called HAS-A ,
// bathroom has a tub.

class Calc { // Super Class , Parent Class , Base
    public int add(int i, int j) {
        return i + j;
    }
}

class CalcAdv extends Calc { // Sub Class , Child , Derived.
    // Instead of creating the add function separately.
    // Fetch it from the class Calc.

    // use the extend keyword to perform inhertiance in java.
    public int sub(int i, int j) {
        return i - j;
    }
}

class CalcVeryAdv extends CalcAdv {
    public int multi(int i, int j) {
        return i * j;
    }
}

public class demo1 {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        CalcAdv c2 = new CalcAdv();
        CalcVeryAdv c3 = new CalcVeryAdv();

        int r1 = c1.add(1, 4);
        int r2 = c2.add(2, 2);
        int r3 = c3.sub(6, 1);

        System.out.print(r1);
        System.out.print(r2);
        System.out.print(r3);
    }
}
