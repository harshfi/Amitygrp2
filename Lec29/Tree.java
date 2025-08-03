package Lec29;

import java.util.Scanner;

public class Tree {

	 class Node {
		int data;
		Node left;
		Node right;
	}
	 Node root;
	public  Tree() {
		this.root=Create();
	}
	
	public  Node Create() {
		Scanner sc= new Scanner(System.in);
		Node n=new Node();
		
		n.data=sc.nextInt();
		
		System.out.println(n.data+" Do you want to have the left child of this node");
		int l= sc.nextInt();//1==yes otherwise no
		if(l==1) {
			n.left=Create();
		}
		System.out.println(n.data+" Do you want to create the node at right");
		int r=sc.nextInt();
		if(r==1) {
			n.right=Create();
		}
		return n;
	}
	
	public void preorder(Node root) {
		
		if(root==null)return ;
		
		System.out.print(root.data+" ");
		preorder(root.left);
		preorder(root.right);
		
	}
	
	public void postorder(Node root) {
		
		if(root==null) return ;
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+" ");
		
	}
	
	public void inorder(Node root) {
		
		if(root==null) return;
		
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	public int height(Node root){
        if(root==null) return 0;

        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }

}
