/**
 * Creado por: Victor Roman Garrido
 * Fecha:9/08/2021 4:09:20 p. m.
 */
package hackerrank.BSTTraversal;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Solution {
	
	static void levelOrder(Node root){
	      //Write your code here
	Queue<Node> cola = new LinkedList<Node>();
		
		if (root!=null) {
			cola.add(root);
		}
		while (!cola.isEmpty()) {
			Node arbol = cola.remove();
			
			if(arbol.left!=null) {
	            cola.add(arbol.left);
	        }
			if (arbol.right!=null) {
				cola.add(arbol.right);
			}
			System.out.print(arbol.data+" ");
		}
		
		
		
/*		
		if(t is not empty) {
        // enqueue current root
        queue.enqueue(t)
        
        // while there are nodes to process
        while( queue is not empty ) {
            // dequeue next node
            BinaryTree tree = queue.dequeue();
            
            process tree's root;
            
            // enqueue child elements from next level in order
            if( tree has non-empty left subtree ) {
                queue.enqueue( left subtree of t )
            }
            if( tree has non-empty right subtree ) {
                queue.enqueue( right subtree of t )
            }
            
            */
		
	    }
	
	
	public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
	}

}
