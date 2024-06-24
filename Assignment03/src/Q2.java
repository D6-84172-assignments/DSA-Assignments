import java.util.Scanner;

class List2{
	static class Node {
		private int data ;
		private Node next ;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	private Node head ;
	Scanner sc;
	public List2(Scanner sc) {
		sc = sc;
		this.head = null;
	}
	
	public void display() {
		Node trav = head;
		System.out.print("List :");
		while(trav != null) {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		System.out.println("");
	}
	public void addFirst(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;
	}
    public void addAfterNode(int node , int val) {
    	Node newnode = new Node(val);
    	Node trav = head ;
    	while(trav != null) {
    		if(trav.data == node) {
    			break;
    		}
    		trav = trav.next;
    	}
    	newnode.next = trav.next;
    	trav.next = newnode ;
    }
    public void addBeforeNode(int node , int val) {
    	Node newnode = new Node(val);
    	Node trav = head ;
    	Node nodebefore = head;
    	int counter = 0 ;
    	while(trav != null) {
    		if(trav.data == node) {
    			break;
    		}
    		nodebefore = trav;
    		trav = trav.next;
    		counter++;
    	}
    	if (counter == 0)
    		addFirst(val);
    	else {
    	newnode.next = nodebefore.next;
    	nodebefore.next = newnode ;
    	}
    }
}



public class Q2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	List2 l = new List2(sc);
	l.addFirst(10);
	l.addFirst(20);
	l.addFirst(30);
	l.display();
	System.out.println("Add After Node : ");
	l.addAfterNode(30, 35);
	l.display();
	System.out.println("Add Before Node : ");
	l.addBeforeNode(30, 15);
	l.display();
}
}
