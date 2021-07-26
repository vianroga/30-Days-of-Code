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
public class Day9 {

	/**
	 * @param args
	 */
	 public static int factorial(int n) {
		    // Write your code her
	//factorial = n * n-1;
	//5!=1*2*3*4*5	 
		
		  
 //solucion con recursividad
		 
		if(n>1) {
			
			return n*factorial(n-1);
			
			
				
		}else {
			
			return n;
		}
		
		 
		
//solucion 2 sin recursividad
		 
		
		/*
		 int factorial=1;
		 for (int i = 1; i<=n; i++) {
			
			factorial=factorial*i;
			System.out.println("iteracion "+i+": " +factorial + " x "+ i +" = "+ factorial);
			
		}
		 return factorial;
		 */
		 
	}
	
	
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
     // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = factorial(n);

        System.out.print(result);
        
     // bufferedWriter.write(String.valueOf(result));
     // bufferedWriter.newLine();

        bufferedReader.close();
     // bufferedWriter.close();
    }

}
