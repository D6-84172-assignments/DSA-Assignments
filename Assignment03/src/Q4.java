
//Write a function which will insert values in sorted order into linked list.

class List4{
	static class Node {
		private int data;
		private Node next ;
		public Node (int val) {
			data = val;
			next = null;
		}
	}
	private Node head;
	int count = 0;
	public List4() {
		head = null;
	}
	public void addNode(int value) {
		Node newnode = new Node(value);
		if(head == null ) {
			head = newnode;
			count++;
		}
		else {
			System.out.println(head.data);
			Node trav = head;
			Node before = head ;
			while(trav != null) {
				if(head.data >= newnode.data) {
					newnode.next = head;
					head = newnode ;
					break;
				}
			else if(trav.data > newnode.data) {
					newnode.next = before.next;
					before.next = newnode;
					break;
				}
				else if (trav.next == null) {
					trav.next = newnode;
					break;
				}
				before = trav;
				trav = trav.next;
			}
			
			count++;
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
}

public class Q4 {

	public static void main(String[] args) {
	 List4 l = new List4();
	 l.addNode(7);
	 l.addNode(2);
	 l.addNode(4);
	 l.addNode(3);
	 l.addNode(5);
	 l.addNode(6);
	 l.addNode(1);
	 l.display();
	 System.out.println("...");
	}

}
