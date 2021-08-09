/**
 * Creado por: Victor Roman Garrido
 * Fecha:3/08/2021 7:59:08 p. m.
 */
package hackerrank.generic;

import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Generics {
	
	public static void main(String args[]){
		
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        
        for (int i = 0; i < n; i++) {
        	
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray(intArray);
        stringPrinter.printArray(stringArray);
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 

}
