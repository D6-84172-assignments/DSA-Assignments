/* Implement singly circular linked list using tail pointer (no head pointer). Compare time complexities of
 all operations. */

class List1 {
	static class Node {
		private int data ;
		private Node next;
		public Node (int data) {
			this.data = data;
			next = null ;
		}
	}
	private Node tail ;
	private int count =0;
	public List1() {
		tail = null;
	}
	
	public void display() {
		if(count > 0) {
		Node trav = tail.next;
		for(int i=0;i<count;i++) {
			System.out.print(" "+trav.data);
			trav = trav.next;
		}
		System.out.println(" ");
		}
		else 
			System.out.println("No Node members in linked list...");
		System.out.println(tail.data);
	}
	
	public void addFirst(int value) {
		Node nn = new Node(value);
		if(tail == null ) {
			tail = nn;
			tail.next = tail;
			count++;
		}
		else {
			nn.next = tail.next;
			tail.next = nn ;
			count++;
		}
	}
	public void addLast(int value) {
		Node nn = new Node(value);
		if(tail == null ) {
			tail = nn;
			tail.next = tail;
			count++;
		}
		else {
			nn.next = tail.next ;
			tail.next = nn;
			tail = nn ;
			count++;
		}
	}
	public void addPos(int value , int pos) {
		Node nn = new Node(value);
		if(pos < 1 || pos > count+1) 
			System.out.println("Invalid position...");	
		else if (pos == 1)
			addFirst(value);
		else if (pos == count + 1)
			addLast(value);
		else {
			Node trav = tail.next;
			for(int i=1;i < pos-1 ;i++) {
				trav = trav.next;
			}
			nn.next = trav.next;
			trav.next = nn;
			count++ ;
		}
	}
	public void deleteFirst() {
		if(tail == null)
			return;
		else if(count == 1) {
			tail = null;
			count--;
		}
		else {
			tail.next = tail.next.next ;
			count--;
		}
	}
	public void deleteLast() {
		
		if(tail == null)
			return;
		else if(count == 1) {
			tail = null;
			count--;
		}
		else {
			System.out.println(count);
			Node trav = tail.next;
			Node prev = tail;
			for(int i=1;i < count ; i++) {
				prev = trav;
				trav = trav.next;
			}
			prev.next = trav.next;
			tail = prev ;
			count--;
		}
	}
	public void deletePos(int pos) {
		if(pos < 1 || pos > count )
			System.out.println("Invaid position...");
		else if (pos == count) 
			deleteLast();
		else if(pos == 1)
			deleteFirst();
		else {
			Node trav = tail.next;
			Node prev = tail;
			for(int i=1;i < pos ; i++) {
				prev = trav;
				trav = trav.next;
			}
			prev.next = trav.next;
			count--;
		}
	}
}

public class Q1 {
public static void main(String[] args) {
	List1 l = new List1();
	l.addFirst(10);
	l.addFirst(20);
	l.addLast(30);
	l.addLast(40);
	l.addPos(4500, 4);
	l.display();
 //   l.deleteFirst();
 //   l.display();
//    l.deleteLast();
  //  l.display();
    l.deletePos(4);
    l.display();
}
}
