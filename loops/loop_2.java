package loops;

/**
 * loop_2
 * 
 * Learning about switch statements
 * 
 * Char gets converted into integer for some cases.
 */
public class loop_2 {
    public static void main(String[] args) {
        int n = 3;

        switch (n) {
            case 1:
                System.out.print("One");
                break;
            case 2:
                System.out.print("Two");
                break;
            case 3:
                System.out.print("Three");
                break;
            case 4:
                System.out.print("Four");
                break;
            default:
                System.out.print("None");
                break;
        }
    }
}