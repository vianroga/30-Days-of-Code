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
public class Day2 {
	
	
	
	public static void solve(double meal_cost, int tip_percent, int tax_percent) {
	    // Write your code here
		
		double tip;
		double tax;
		double total;
		
		tip = meal_cost*tip_percent/100;
		tax= meal_cost*tax_percent/100;
		total= meal_cost+tip+tax;
		
		System.out.println(Math.round(total));
	

	    }
	

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Day2 result = new Day2();
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

        result.solve(meal_cost, tip_percent, tax_percent);

        bufferedReader.close();

	}

}
