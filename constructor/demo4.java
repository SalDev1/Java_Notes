package constructor;

/*
 * Knowing more about constructor overloading.
 * 
 */
class Casio {
    int num1;
    int num2;
    String operation;

    public Casio(int i, int j) {
        num1 = i;
        num2 = j;
        operation = "Nothing";
    }

    public Casio(int i, int j, String op) {
        num1 = i;
        num2 = j;
        operation = op;
    }
}

public class demo4 {
    public static void main(String[] args) {

    }
}
