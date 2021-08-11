/**
 * Creado por: Victor Roman Garrido
 * Fecha:11/08/2021 11:09:37 a. m.
 */
package hackerrank.bitwiseAND;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Victor Roman Garrido
 *	
 */
public class Solution {

	/**
	 * @param args
	 */	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        for (int tItr = 0; tItr < t; tItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int count = Integer.parseInt(firstMultipleInput[0]);

            int lim = Integer.parseInt(firstMultipleInput[1]);

            int res = Result.bitwiseAnd(count, lim);
            
            System.out.println(String.valueOf(res));

          //  bufferedWriter.write(String.valueOf(res));
          //  bufferedWriter.newLine();
        }

        bufferedReader.close();
      //  bufferedWriter.close();
	}

}
