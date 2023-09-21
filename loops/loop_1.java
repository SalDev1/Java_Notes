package loops;

/*
 *  If , else , break , continue , switch , while 
 *  These are the keyword that you can use to add certain
 *  conditions based on the given problem.
 * 
 * Ternary Operator.
 * 
 */
public class loop_1 {
    public static void main(String[] args) {
        int n = 6;
        if (n == 0) {
            System.out.println("Nothing");
        } else if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        int m = n > 5 ? 2 : 3;
        System.out.println(m);
    }
}
