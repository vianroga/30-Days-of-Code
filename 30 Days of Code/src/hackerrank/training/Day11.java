/**
 * 
 */
package hackerrank.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Lenovo
 *
 */
public class Day11 {


	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }
        
       
        int array2d [][] = new int [6][6];
        
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
            array2d[i][j]=arr.get(i).get(j);
            }
         }
        
        int reloj=0;
        int aux;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
            	
            	aux=0;//reinicio contador de reloj encontrado
            	
            	//forma de reloj
            	aux+=arr.get(i).get(j); //00
            	aux+=arr.get(i).get(j+1); //01
            	aux+=arr.get(i).get(j+2); //02
            	aux+=arr.get(i+1).get(j+1); //11
            	aux+=arr.get(i+2).get(j); //20
            	aux+=arr.get(i+2).get(j+1); //21
            	aux+=arr.get(i+2).get(j+2); //22
            	            	
            	if(aux>reloj||j==0&&i==0){
                    reloj = aux;
                }
            }
        }
       
       System.out.println(reloj);
   
        bufferedReader.close();
    }

}
