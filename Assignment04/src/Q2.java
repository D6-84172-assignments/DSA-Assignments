// Implement Deque using doubly linear linked.
class Deque1{
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		public Node(int value) {
			data = value;
			next = prev = null;
		}
	}
	private Node head ;
	private Node tail ;
	public Deque1() {
		head = tail = null;
	}
	public void display() {
		Node trav = head ;
		System.out.print("Queue : ");
		while(trav != null) {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	public void reverseDisplay() {
		Node trav = tail;
		System.out.print("Queue : ");
		while(trav != null) {
			System.out.print(" "+trav.data);
			trav = trav.prev;
		}
		System.out.println("");
	}
	public void addFront(int value) {
		Node nn = new Node(value);
		if(head == null)
			head = tail = nn;
		else {
			nn.next = head ;
			head.prev = nn;
			head = nn;
		}
	}
	public void addRear(int value) {
		Node nn = new Node(value);
		if(head == null)
			head = tail = nn;
		else {
            tail.next = nn ; 
            nn.prev = tail;
            tail = nn ;
		}
            
	}
	public void deleteFront() {
		if(head == null) 
			return;
		else if (head == tail )
			head = tail = null;
		else {
			head = head.next;
			head.prev =null;
		}
	}
	public void deleteRear() {
		if(head == null) 
			return;
		else if (head == tail )
			head = tail = null;
		else {
			tail = tail.prev ;
			tail.next = null;
		}
	}
}


public class Q2 {

	public static void main(String[] args) {
		Deque1 d = new Deque1();
		d.addFront(30);
		d.addFront(20);
		d.addFront(10);
		
		d.addRear(40);
		d.addRear(50);
		
		d.deleteFront();
		d.deleteRear();
		
		d.display();
		d.reverseDisplay();
	}
}
