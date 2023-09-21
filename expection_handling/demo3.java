package expection_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 
 * Exception block , try it with the resource.
 * 
 * Our focus over here is to close the resources.
 * 
 * Another way of handling this is using
 * brackets in the tryblock.
 */
public class demo3 {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Enter a number");

        // This syntax is called try with resource.
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            n = Integer.parseInt(br.readLine());
        }
        System.out.println(n);
    }
}
