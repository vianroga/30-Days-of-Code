/**
 * 
 */
package hackerrank.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * @author Lenovo
 *
 */
public class Day10 {

	/**
	 * @param args
	 */
	public static void decimalToBinary(int n) {
	
		String binario = Integer.toBinaryString(n);
		int conteo1=0;
		int conteo2=0;
		
		char []myCharArray=null;
	
		System.out.println(binario);

		for (int i = 0; i < binario.length(); i++) {
			 myCharArray = binario.toCharArray();
		}
		for (int i = 0; i < myCharArray.length; i++) {
			if (myCharArray[i]=='1') {
				conteo1++;
				System.out.println("conteo 1 interacion "+i+ " :" + conteo1);
				conteo2= Math.max(conteo2, conteo1);
				System.out.println("conteo 2 interacion "+i+ " :" + conteo2);
			}else {
				conteo1=0;
				System.out.println("conteo 1 else interacion "+i+ " :" + conteo1);
			}
		}
		
		System.out.println("maximo consecutivo: " + conteo2);
	
	}
	
	 public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());
	        
	        decimalToBinary(n);

	        bufferedReader.close();
	        
	        
	    }

}
