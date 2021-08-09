/**
 * Creado por: Victor Roman Garrido
 * Fecha:4/08/2021 5:30:08 p. m.
 */
package hackerrank.binarysearchtrees;

import java.util.Scanner;

/**
 * @author Victor Roman Garrido
 *
 */
public class Solution {
	
	
	public static int getHeight(Node root){
	  //Write your code here
		if(root == null) {
			return -1;
			
			} else { 
				int alturaRamaDer=getHeight(root.right); 
				int alturaRamaIzq= getHeight(root.left); 
				
				if(alturaRamaIzq>alturaRamaDer) { 	
				return alturaRamaIzq+1;
				
				} else {
					return alturaRamaDer+1;
					
				}
		}
		

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
         int height=getHeight(root);
         System.out.println(height);
     }	
}


