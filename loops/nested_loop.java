package loops;

public class nested_loop {
    public static void main(String[] args) {
        // int n = 3;
        for (char i = 'A'; i <= 'C'; i++) {
            for (char j = 'A'; j < i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
