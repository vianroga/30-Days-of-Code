/**
 * 
 */
package hackerrank.training;

import java.util.Iterator;
import java.util.Scanner;


/**
 * @author Lenovo
 *
 */
public class Day6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Enter your code here. Read input from STDIN. Print output to STDOUT. 
		Your class should be named Solution. */
		
			Scanner scan = new Scanner(System.in);
	        
	        int n = scan.nextInt();
	        String myString="";
	        char []myCharArray=null;
	        
	       
	        scan.nextLine();
	        
	        for (int i = 0; i <n; i++) {
	            
	            myString=scan.nextLine();
	            myCharArray = myString.toCharArray();
	            
	            for (int j = 0; j < myCharArray.length; j++) {
	                if (j%2==0) {
	                        System.out.print(myCharArray[j]);        
	                }
	                
	            }
	            
	       System.out.print(" ");
	            
	                for (int j = 0; j < myCharArray.length; j++) {
	                        if (j%2!=0) {
	                                System.out.print(myCharArray[j]);        
	                        }
	                }
	       System.out.println();
	        
	        }
	        scan.close();  
	} 
	   
	
}
