package loops;

/*
 * 
 * Types of loops we can have is 
 * if , do while , while , for , for each.
 */
public class loop_3 {
    public static void main(String[] args) {
        int n = 5;

        int i = 0;
        while (i <= n) {
            System.out.print("Hello World \n");
            i++;
        }
        int j = 0;
        do {
            System.out.print("Hello World \n");
            j++;
        } while (j <= n);
    }
}
