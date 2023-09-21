package loops;

/**
 * 
 * break :- exits the loop when the condition is true.
 * continue :- skips the current iteration and moves to the next one.
 */
public class loop_4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break;
            }

            System.out.println("value is " + i);
        }
    }
}
