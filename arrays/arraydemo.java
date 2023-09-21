package arrays;

// Array --> A list / Collection of objects or elements of certain type.
/* 
 * 
 * Types of the array 
 * 1D Array 
 * 2D Array 
 * Jagged Array.
 * 
 * You can create an array of objects too.
*/
public class arraydemo {
    public static void main(String[] args) {
        int nums[] = { 8, 12, 76, 54 };
        // Dynamic allocating the memory with the creation of the array.

        // nums[0] = 8;
        // nums[1] = 12;
        // nums[2] = 76;
        // nums[3] = 54;

        // One way of using loop.
        for (int i = 0; i < 4; i++) {
            System.out.print(nums[i] + "\n");
        }

        // Another way of using loop. --> For each loop.
        // Similar to the C++ For Each Loop we use.
        for (int i : nums) {
            System.out.println(i);
        }
    }
}
