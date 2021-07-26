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
public class Day5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        bufferedReader.close();
	        
	        for (int i = 1; i <= 10; i++) {
	        	
	        	System.out.println(n +" x " +i+ " = "+ n*i);
				
			}
	        
	    }

	

}
