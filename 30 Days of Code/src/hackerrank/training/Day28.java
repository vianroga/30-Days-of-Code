/**
 * Creado por: Victor Roman Garrido
 * Fecha:10/08/2021 4:21:43 p. m.
 */
package hackerrank.training;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Victor Roman Garrido
 *
 */
public class Day28 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        ArrayList<String> arrayList = new ArrayList<String>();
        

        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            String firstName = firstMultipleInput[0];

            String emailID = firstMultipleInput[1];
            
            String patronEmail ="[a-z]@gmail.com$";
            Pattern pattern = Pattern.compile(patronEmail);
            Matcher matcher = pattern.matcher(emailID);
            
            if (matcher.find()) {
    			arrayList.add(firstName);
    		}
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);

        bufferedReader.close();
	}

}
