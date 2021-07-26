/**
 * 
 */
package hackerrank.Inheritance;

/**
 * @author Lenovo
 *
 */
public class Student extends Person {
	private int[] testScores;
	/*	
	    *   Class Constructor
	    *   
	    *   @param firstName - A string denoting the Person's first name.
	    *   @param lastName - A string denoting the Person's last name.
	    *   @param id - An integer denoting the Person's ID number.
	    *   @param scores - An array of integers denoting the Person's test scores.
	    */
	    // Write your constructor here
	
	Student(String firstName, String lastName, int identification, int[] scores) {
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		this.testScores=scores;
		
	}
	
	    /*	
	    *   Method Name: calculate
	    *   @return A character denoting the grade.
	    */
	    // Write your method here

	
	public char calculate() {
		char resultado=0;
		int sumatoria=0;
		int promedio=0;
		
	for (int i = 0; i < testScores.length; i++) {
		
		sumatoria += testScores[i];
		promedio=sumatoria/testScores.length;
		
		if (promedio>=90 && promedio <=100) {
			resultado='O';
		}else
		if (promedio>=80 && promedio <90) {
			resultado='E';
		}else
		if (promedio>=70 && promedio <80) {
			resultado='A';
		}else
		if (promedio>=55 && promedio <70) {
			resultado='P';
		}else
		if (promedio>=40 && promedio <55) {
			resultado='D';
		}else
			resultado='T';
		
	}
	 return resultado;	
	
	}

    
}
