package arrays;

// 2-D Array
public class arraydemo_2 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 2, 4, 6, 8 };
        int c[] = { 5, 6, 7, 8 };

        int d[][] = {
                { 1, 2, 3, 4 },
                { 2, 4, 6, 8 },
                { 5, 6, 7, 8 }
        };

        // System.out.print([0][1]);
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }

        // auto keyword doesn't work over here.
        // Properly assign the data type.
        for (int i[] : d) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
