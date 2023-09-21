package access_modifiers;

/**
 * Here we deal with access modifiers.
 * 
 * All types of access modifiers are
 * 
 * Final
 * Abstract
 * Private
 * Public
 * Protected
 * 
 * Final , abstract and public can be used.
 * Private and Protected cannot be used with class.
 * 
 * If you want variables and methods to be used outside
 * of the package , make sure they are public.
 * 
 * You can assign public, private keywords to the variables
 * and functions.
 * 
 * Private : Specific Class
 * Default : Specific Package
 * Public : Any Class or Package
 * Protected : Subsiding Class.
 */

class A { // default modifier.

}

public class demo1 {
    public static void main(String[] args) {
        A obj = new A();

    }
}
