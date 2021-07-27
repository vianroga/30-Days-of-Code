/**
 * Creado por: Victor Roman Garrido
 * Fecha:27/07/2021 12:34:51 p. m.
 */
package hackerrank.scope;

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
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        sc.close();

	        Difference difference = new Difference(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);
	}

}
