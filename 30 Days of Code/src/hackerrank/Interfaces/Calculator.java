/**
 * Creado por: Victor Roman Garrido
 * Fecha:2/08/2021 1:54:10 p. m.
 */
package hackerrank.Interfaces;

/**
 * @author Victor Roman Garrido
 *
 */
public class Calculator implements AdvancedArithmetic {
	
	public int divisorSum(int n) {
		int resultado = 0;
		for (int i = 1; i <= n; i++) {
			if (n%i==0) {
				resultado+=i;
			}
		}
		
        return resultado;
    }
}
