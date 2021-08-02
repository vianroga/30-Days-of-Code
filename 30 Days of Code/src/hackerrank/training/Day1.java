/**
 * 
 */
package hackerrank.training;

import java.util.Scanner;

/**
 * @author Lenovo
 *
 */

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        
        int a;
        double b;
        String c="";
        
        Scanner scan = new Scanner(System.in);
        
        a= scan.nextInt();
        b= scan.nextDouble();
        c= scan.next();
        c+= scan.nextLine();
      
        System.out.println(i+a);
        System.out.println(d+b);
        System.out.println(s+c);
         

        /* Declare second integer, double, and String variables. */

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        /* Print the sum of both integer variables on a new line. */

        /* Print the sum of the double variables on a new line. */
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
       scan.close();
        
    }
}
