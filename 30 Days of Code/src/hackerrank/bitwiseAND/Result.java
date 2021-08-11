/**
 * Creado por: Victor Roman Garrido
 * Fecha:11/08/2021 11:09:03 a. m.
 */
package hackerrank.bitwiseAND;

/**
 * @author Victor Roman Garrido
 *
 */
public class Result {
	/*
     * Complete the 'bitwiseAnd' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER N
     *  2. INTEGER K
     */

    public static int bitwiseAnd(int N, int K) {
        // Write your code here
    	int resultado=0;
    	for (int i = 1; i < N; i++) {
    		for (int j = i+1; j <= N; j++) {
    			int tmp = i&j;
    			System.out.println("i: "+i);
    			System.out.println("j: "+j);
    			System.out.println(tmp);
    			if (resultado<tmp && tmp<K) {
					resultado=tmp;
				}
    
			}
			
		}
    
    	return resultado;
    }

}
