/**
 * 
 */
package hackerrank.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class Day7 {

	/**
	 * @param args
	 * @return 
	 */
	
	 public static void main(String[] args) throws IOException {
		 	
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> arr = new ArrayList<>();

	        for (int i = 0; i < n; i++) {
	            int arrItem = Integer.parseInt(arrTemp[i]);
	            arr.add(arrItem);
	        }
	        
	       Collections.reverse(arr);

	        for (int i = 0; i < n; i++) {
	    
	            System.out.print(arr.get(i));
	            System.out.print(" ");
	        }
	        
	      
	        
	        bufferedReader.close();
	    }
}
