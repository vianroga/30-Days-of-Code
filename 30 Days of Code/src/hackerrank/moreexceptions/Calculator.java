/**
 * Creado por: Victor Roman Garrido
 * Fecha:2/08/2021 11:35:02 a. m.
 */
package hackerrank.moreexceptions;

/**
 * @author Victor Roman Garrido
 *
 */
 class Calculator {

	 int power(int n, int p) throws Exception {
		// TODO Auto-generated method stub
		 int result=0;
		 if (n<0 || p<0) {
	throw new Exception("n and p should be non-negative");
		}else {
		  result= (int) Math.pow(n, p);
		} 
		return result;
	} 
}
