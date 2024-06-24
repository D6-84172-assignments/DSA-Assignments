//Write recursive function to add node into bst.

class Bst{
	static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	private Node root;
	public Bst() {
		root = null;
	}
	public boolean isEmpty() {
		return root == null;
	}
	public void addNode(int value) {
		Node nn = new Node(value);
		if(isEmpty())
			root = nn;
		else {
			Node trav = root;
			while(true) {
				if(value < trav.data) {
					if(trav.left == null) {
						trav.left = nn;
						break;
					}
					else {
						trav = trav.left;
					}	
				}
				else {
					if(trav.right == null) {
						trav.right = nn;
						break;
					}
					else {
						trav = trav.right;
					}
				}
			}
		}
	}
	
	//TO DISPLAY THE TREE>>>
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder() {
		System.out.print("Preorder :: ");
		preorder(root);
		System.out.println("");
	}
	
	
	public void deleteAll() {
		root = null;
	}
}

	

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Bst bst = new Bst();
		
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);
		
		bst.preorder();

		
	}

}
