/**
 * Creado por: Victor Roman Garrido
 * Fecha:9/08/2021 6:48:21 p. m.
 */
package hackerrank.training;

import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Day26 {
	//si se devuelve antes de la fecha =0
	//si se devuelve despues del dia esperado pero en el mismo mes y año esperado =15 * dias de retraso
	//si se devuelve despues del mes esperado pero en mismo año = 500 * dias de retraso
	//si se devueve despues del año esperado = 10000
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
	Scanner scan = new Scanner(System.in);
	int diaDevuelto= scan.nextInt();
	int mesDevuelto= scan.nextInt();
	int anioDevuelto= scan.nextInt();
	int diaEsperado= scan.nextInt();
	int mesEsperado= scan.nextInt();
	int anioEsperado= scan.nextInt();
	int fine=0;
	scan.close(); 
	
	if (anioDevuelto>anioEsperado) {
		fine=10000;
	}else if (mesDevuelto>mesEsperado) {
		if (anioDevuelto==anioEsperado) {
			fine=500*(mesDevuelto-mesEsperado);
		}
	}else if (diaDevuelto>diaEsperado) {
		if (mesDevuelto==mesEsperado) {
			fine=15*(diaDevuelto-diaEsperado);
		}
	}
		System.out.println(fine);
	}

}
