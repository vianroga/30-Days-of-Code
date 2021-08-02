/**
 * Creado por: Victor Roman Garrido
 * Fecha:2/08/2021 10:35:02 a. m.
 */
package hackerrank.training;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/**
 * @author Victor Roman Garrido
 *
 */
public class Day16 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
        	 String S = bufferedReader.readLine();
        	 System.out.println(Integer.parseInt(S));
        	 bufferedReader.close();
		} catch (Exception e) {
			System.out.print("Bad String");
		}  
	}

}
