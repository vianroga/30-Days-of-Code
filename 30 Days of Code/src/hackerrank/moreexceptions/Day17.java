/**
 * Creado por: Victor Roman Garrido
 * Fecha:2/08/2021 11:32:38 a. m.
 */
package hackerrank.moreexceptions;

import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
class Day17 {

	/**
	 * @param args
	 */
	 public static void main(String[] args) {
		    
	        Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        while (t--> 0) {
	        
	            int n = in.nextInt();
	            int p = in.nextInt();
	            Calculator myCalculator = new Calculator();
	            try {
	                int ans = myCalculator.power(n, p);
	                System.out.println(ans);
	            }
	            catch (Exception e) {
	                System.out.println(e.getMessage());
	            }
	        }
	        in.close();
	    }

}
