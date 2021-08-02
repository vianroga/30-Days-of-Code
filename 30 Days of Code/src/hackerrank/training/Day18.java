/**
 * Creado por: Victor Roman Garrido
 * Fecha:2/08/2021 12:23:39 p.�m.
 */
package hackerrank.training;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author Victor Roman Garrido
 *
 */
public class Day18 {
	
	Stack<Character> pila = new Stack<Character>();
	Queue<Character> cola = new LinkedList<>();
	
	private char popCharacter() {
		// TODO Auto-generated method stub
		return pila.pop();
	}

	private char dequeueCharacter() {
		// TODO Auto-generated method stub
		
		return cola.remove();	
	}

	private void pushCharacter(char c) {
		// TODO Auto-generated method stub
		pila.push(c);
	}	

	private void enqueueCharacter(char c) {
		// TODO Auto-generated method stub
		cola.add(c);
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Day18 p = new Day18();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;                
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is " 
                           + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

	

}


