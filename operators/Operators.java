package operators;

/*
 *    Arithemetic --> + , - , / , % , *, += , -= , *= , /= , %= , n++ , n-- , ++n , --n;
 *    Bitwise --> | , & , ^ , ! , << , >> 
 *    Relational --> || , && , == , < , > , >= , <=
 * 
 *    Pre increment --> Increment value and later assign it.
 *    Post increment --> Assign value and later increment it .
 */
public class Operators {
    public static void main(String[] args) {
        int m = 6, n = 2;
        int r1 = m + n;
        int r2 = m - n;
        int r3 = m * n;
        int r4 = m / n;

        double r5 = (double) m / n;
        double r6 = m % n;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
        System.out.println(r5);
        System.out.println(r6);
    }
}
