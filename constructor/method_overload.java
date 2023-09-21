package constructor;

/**
 * 
 * In this example , we are looking to understand
 * method overloading similar to constructor overloading.
 * 
 * Just called same method with different type
 * of parameters to understand method overloading.
 */
class Casio {
    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void add(double i, double j) {
        System.out.println(i + j);
    }

}

public class method_overload {
    public static void main(String[] args) {
        Casio obj = new Casio();
        obj.add(5, 2);
    }
}
