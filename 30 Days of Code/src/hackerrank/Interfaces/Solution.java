/**
 * Creado por: Victor Roman Garrido
 * Fecha:2/08/2021 1:53:17 p. m.
 */
package hackerrank.Interfaces;

import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Solution {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int n = scan.nextInt();
	        scan.close();
	        
	      	AdvancedArithmetic myCalculator = new Calculator(); 
	      	
	        int sum = myCalculator.divisorSum(n);
	        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
	        System.out.println(sum);
	    }

}
