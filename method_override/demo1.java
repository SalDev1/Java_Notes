package method_override;

/**
 * 
 * Learning about method override.
 * 
 * When we overwrite a method in sub class which is
 * predefined in the super class , this kind of way
 * is called method overriding.
 * 
 * Below example : Class B overrides method of Class A.
 * 
 * Compile time errors are much better than logical bugs.
 * Use the annontation called override.
 * 
 * It is sort of checking system to check if we are properly
 * overwriting a method which is predefined in super class.
 * 
 * If something goes wrong , it gives you compile time error.
 * 
 * super keyword --> to access the parent class object within the
 * dervived class.
 *
 */
class A {
    public void show() {
        System.out.println("in A");
    }
}

class B extends A {

    @Override
    public void show() {
        super.show(); // it executes the show method in super class i.e class A.
        System.out.println("in B");
    }
}

public class demo1 {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
