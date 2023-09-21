package user_input;

import java.util.Scanner;

/*
 * We are learning on how we are able to get all user input.
 * 
 * 1] Scanner class
 * System.in --> you are getting the input from the keyboard.
 */

public class demo1 {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);

        // This will fetch an integer given by the user.
        n = sc.nextInt();
        System.out.println(n);
    }
}
