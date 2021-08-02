/**
 * Creado por: Victor Roman Garrido
 * Fecha:28/07/2021 2:15:07 p. m.
 */
package hackerrank.linkedlist;

import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Solution {
	
	 public static  Node insert(Node head,int data) {
	        //Complete this method
		 if (head==null) { 
			head = new Node(data);	
		} else {
		 	Node insercion = head;
	        while(insercion.next != null) {
	        insercion=insercion.next;  
	        }   
	        insercion.next= new Node(data);
		}
			return head;
	    }

		public static void display(Node head) {
	        Node start = head;
	        while(start != null) {
	            System.out.print(start.data + " ");
	            start = start.next;
	        }
	    }

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);
	        Node head = null;
	        int N = sc.nextInt();

	        while(N--> 0) {
	            int ele = sc.nextInt();
	            head = insert(head,ele);
	        }
	        
	        display(head);
	        sc.close();
	    }
}
