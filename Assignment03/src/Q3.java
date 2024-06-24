import java.util.Stack;

// Display Singly linear linked list in reverse order.
class List3{
	static class Node {
		private int data ;
		private Node next ;
		public Node (int val)
		{
			next = null;
			data = val;
		}	
	}
	
	private Node head ;
	int counter ;
	public List3() {
		head = null;
		counter = 1;	
	}
	public void addLast(int value) {
		Node newnode = new Node(value);
		if(head == null ) {
			head = newnode;
	        counter++;
		}
		else {
			Node trav = head;
			while(trav.next != null) {
				trav = trav.next;
			}
			trav.next = newnode ;
			counter++;
		}
	}
	public void display() {
		System.out.print("List : ");
		Node trav = head;
		while(trav != null) {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		System.out.println("  ");
	}
	public void reverse_display() {
		System.out.print("List Reversed : ");
		Node trav = head;
		Stack<Integer> st = new Stack<Integer>();
		while(trav != null) {
			st.push(trav.data);
			trav = trav.next;
		}
		for(int i=1;i<counter;i++) {
			System.out.print(" "+st.pop());
		}
	}
}


public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List3 l = new List3();
        l.addLast(10);
        l.addLast(20);
        l.addLast(30);
        l.addLast(40);
        l.display();
        l.reverse_display();
	}

}
