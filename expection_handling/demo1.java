package expection_handling;

/*
 * Let's understand what exception is all about ?? 
 * and also types of exception.
 * 
 * 1] ArithemeticException
 * 2] Handling Mutliple Catch Blocks.
 */

public class demo1 {
    public static void main(String[] args) {

        /*
         * As soon as you get an excemption in your try loop ,
         * it straights jumps on to the catch block.
         */
        try {
            int a[] = new int[6];
            a[4] = 8;
            int i = 7;
            int j = 0;
            int k = i / j;
            System.out.println("Output is  " + k);
        } catch (ArithmeticException e) {
            System.err.println("Cannot divide by Zero ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Stay in your limit");
        } catch (Exception e) {
            System.out.println("Something wrong");
        } finally {
            // Even if you are getting or not getting exception , it will always execute on
            // your own.
            System.out.println("Bye");
        }
    }
}
