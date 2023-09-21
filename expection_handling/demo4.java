package expection_handling;

/*
 * We are learning about user defined expection.
 * 
 */

public class demo4 {
    public static void main(String[] args) {
        int i, j;
        i = 8;
        j = 9;

        try {
            int k = i / j;

            if (k == 0)
                // We are making our exception work over here.
                throw new ownException("this is not possible");

            System.out.println(k);
        } catch (Exception e) {
            System.out.println("Error  " + e.getMessage());
        }
    }
}
