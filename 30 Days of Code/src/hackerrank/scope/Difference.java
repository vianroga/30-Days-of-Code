/**
 * Creado por: Victor Roman Garrido
 * Fecha:27/07/2021 12:13:53 p. m.
 */
package hackerrank.scope;



/**
 * @author Victor Roman Garrido
 *
 */
public class Difference {

	/**
	 * @param args
	 */
	
	private int[] elements;
  	public int maximumDifference;

	// Add your code here
  	
  	Difference(int [] elements){
  		
  		this.elements=elements;	
  	}
  	
  	public void computeDifference () {
  		int aux;
  		for (int i = 0; i < elements.length; i++) {
  			for (int j = 0; j < elements.length; j++) {
				aux= Math.abs(elements[i]-elements[j]);
				
				if (aux>maximumDifference) {
					maximumDifference=aux;
				}
			}	
		}		
  	}

}
