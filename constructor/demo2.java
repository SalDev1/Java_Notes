package constructor;

/*
 * 
 * Want to do the constructor overloading , try only 
 * changing the parameters + handling data types effectively.
 */
class Calc {
    int num1;
    int num2;
    int result;

    public int perform(int extra, int prod) {
        result = (num1 + num2 + extra) * prod;
        if (result > 50) {
            return 1;
        } else {
            return 0;
        }
    }

    public Calc() {
        num1 = 1;
        num2 = 2;
    }

    public Calc(int c, int d) {
        num1 = c;
        num2 = d;
    }

    public Calc(int n) {
        num1 = n;
    }

    public Calc(double d) {
        num1 = (int) d;
    }
}

public class demo2 {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.num1 = 3;
        obj.num2 = 5;
        int k = obj.perform(2, 3);
        System.out.println(k);
    }
}
