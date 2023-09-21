package expection_handling;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 *  Let's understand about the check exception.
 *  We are handling a case where the user is not able to give 
 *  more input.
 * 
 * Any classes that comes from the package io is called resources.
 * 
 * After using the resources you have to close it.
 * 
 * It is recommended to close the resources in the 
 * final block and it is of utmost responsibility.
 */

public class demo2 {
    public static void main(String[] args) throws Exception {
        int n = 0;
        System.out.println("Enter a number");

        BufferedReader br = null;

        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            br.close();
        }
        System.out.println(n);
    }
}
