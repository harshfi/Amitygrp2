package Lec29;

public class TreeClient {

	public static void main(String []args) {
		Tree t= new Tree();
		
		t.preorder(t.root);
		System.out.println();
		t.postorder(t.root);
		System.out.println();
		t.inorder(t.root);
	}

}
