/**
 * Creado por: Victor Roman Garrido
 * Fecha:9/08/2021 5:39:12 p. m.
 */
package hackerrank.training;

import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Day25 {
	
	public static boolean primate (int numero) {
		boolean resultado = true;
		for (int i = 2; i <= Math.sqrt(numero); i++) {
			
		if (numero<2) {
			resultado=false;
		}
			if (numero%i==0) {
				resultado=false;
			}
		}
		return resultado;	
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		for (int i = 0; i < n; i++) {
			
			int numero=scan.nextInt();
			
			if (numero>=2 && primate(numero)) {
					System.out.println("Prime");
				}else {
					System.out.println("Not prime");
				}
		}
		scan.close();
	}

}
