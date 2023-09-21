package constructor;

/**
 * demo3
 * 
 * They are shadowing the local instance / variable.
 * num1 = num1
 * num2 = num2
 * 
 * By specifing
 * this.num1 and this.num2 --> we are specifying instance
 * and not copying local variable.
 * 
 * Only use this when we have same variable same.
 * this --> used to refer current class instance variable.
 * 
 * Eg :- Having 2 objects with two different parameters with two
 * different values , this keyword helps to refer the current
 * value of the certain object called using class.
 * 
 * It dynamically handles different values been passed
 * at the instance of the object.
 * 
 */
class C {
    int num1;
    int num2;
    int result;

    public C(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}

public class demo3 {
    public static void main(String[] args) {

        C obj = new C(4, 5);

        System.out.println(obj.num1);
        System.out.println(obj.num2);
    }
}