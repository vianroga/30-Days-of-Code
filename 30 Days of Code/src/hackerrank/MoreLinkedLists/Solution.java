/**
 * Creado por: Victor Roman Garrido
 * Fecha:9/08/2021 4:52:16 p. m.
 */
package hackerrank.MoreLinkedLists;

import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Solution {
	
	public static Node removeDuplicates(Node head) {
	      //Write your code here
		
		Node nodeActual = head;
		
		while (nodeActual.next!=null) {
//comparo valor el actual del nodo con el valor del siguiente y cambio de posicion de ser igual
			if (nodeActual.data==nodeActual.next.data) {
				 	nodeActual.next=nodeActual.next.next;
				
			}else {
				nodeActual=nodeActual.next;
			}
			
		}
		return head;
	    }
	
	
	 public static  Node insert(Node head,int data)
	    {
	        Node p=new Node(data);			
	        if(head==null)
	            head=p;
	        else if(head.next==null)
	            head.next=p;
	        else
	        {
	            Node start=head;
	            while(start.next!=null)
	                start=start.next;
	            start.next=p;

	        }
	        return head;
	    }
	
	
	public static void display(Node head)
    {
          Node start=head;
          while(start!=null)
          {
              System.out.print(start.data+" ");
              start=start.next;
          }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        Node head=null;
        int T=sc.nextInt();
        while(T-->0){
            int ele=sc.nextInt();
            head=insert(head,ele);
        }
        head=removeDuplicates(head);
        display(head);
	}

}
