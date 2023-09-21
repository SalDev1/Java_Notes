package constructor;

/**
 * 
 * The main thing about constructor :-
 * Is to predefined / assign default values to some
 * features or methods that will be fixed throughout
 * the given situation.
 * 
 * 
 * 1] Constructor is a member method.
 * 2] It has same name as class name.
 * 3] It will never return anything.
 * 4] It will be used allocate memory.
 * 5] It will be called automatically once when intialize the object of the
 * class.
 * 
 * When you create an object for the first time , default
 * constructor is generated only once + can't call the constructor
 * for same instance.
 * 
 * It will called automatically, once the object is initialized from the class.
 * 
 * Mutliple constructor with the different parameters with same class name is
 * called constructor overloading.
 */
class A {
    int i;
    float f;

    // Call it is default constructor.
    public A() {
        i = 1;
        f = 1.1f;
        System.out.print("Hi");
    }

    public A(int i) {
        System.out.print("Hello");
    }
}

public class demo1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.f);
    }
}
