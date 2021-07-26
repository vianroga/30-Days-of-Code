package hackerrank.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day3 {



	public static void isWeird(int N) {
		
		//impares son raros
		
		if (N%2==0) {
			
			if (N>=2 && N<=5) {
				System.out.println("Not Weird");	
			}
			
				if (N>=6 && N<=20) {
					System.out.println("Weird");	
				}
					if (N>20) {
						System.out.println("Not Weird");
					}

		}else {
			System.out.println("Weird");
		}
		
	}




	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	    
	    Day3 Result = new Day3();

	    int N = Integer.parseInt(bufferedReader.readLine().trim());
	    
	    Result.isWeird(N);

	    bufferedReader.close();
	    
	    
	}

}
