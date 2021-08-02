/**
 * Creado por: Victor Roman Garrido
 * Fecha:2/08/2021 2:12:56 p. m.
 */
package hackerrank.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Victor Roman Garrido
 *
 */

public class Day20 {
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }
        // Write your code here
        int numberOfSwaps = 0;
        
        for (int i = 0; i < a.size() ; i++) {
            // Track number of elements swapped during a single array traversal
            
            for (int j = 0; j < a.size()-1; j++) {
                // Swap adjacent elements if they are in decreasing order
              
            	if (a.get(j) > a.get(j+1)) {
            		Collections.swap(a, j, j+1);
                    numberOfSwaps++;
                }
            }
            // If no elements were swapped during a traversal, array is sorted
            if (numberOfSwaps == 0) {
                break;
            }    
        }
	        System.out.println("Array is sorted in "+ numberOfSwaps +" swaps.");
	    	System.out.println("First Element: "+ a.get(0));
	    	System.out.println("Last Element: "+ a.get(a.size()-1));
        	bufferedReader.close();
    }
}
