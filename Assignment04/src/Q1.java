// 1. Implement stack and queue using linked list.
class Stack1{
	static class Node {
		private int data;
		private Node next;
		private Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	private Node tail;
	public Stack1() {
		super();
		this.tail = null;
	}
	public void push(int value) {
		Node nn = new Node(value);
		if(tail == null) 
			tail = nn;
		else {
			nn.prev = tail;
			tail.next = nn ;
			tail = nn;	
		}
	}
	public int pop () {
		if(tail == null ) {
			System.out.println("Empty stack");
			return 0;
		}
		else if(tail.prev == null) {
			int val = tail.data;
			tail = null;
			return val;
		}
		else {
			int val = tail.data;
			tail = tail.prev ;
			return val;
		}
	}
	public int peek () {
		if(tail == null ) {
			System.out.println("Empty stack");
			return 0;
		}
		else 
			return tail.data;
	}
	
}

class Queue1{
	static class Node {
		private int data;
		private Node next;
		private Node prev;
		public Node(int data) {
			this.data = data;
			this.next = null;
			this.prev = null;
		}
	}
	private Node tail;
	private Node head;
	public Queue1() {
		this.tail = null;
		this.head = null;
	}
	public void push(int value) {
		Node nn = new Node(value);
		if(tail == null) { 
			tail = nn;
			head = nn;
		}
		else {
			nn.prev = tail;
			tail.next = nn ;
			tail = nn;	
		}
	}  
	public int pop () {
		if(tail == null ) {
			System.out.println("Empty queue");
			return 0;
		}
//		else if(tail.prev == null) {
//			int val = tail.data;
//			tail = null;
//			head = null;
//			return val;
//		}
		else {
			int val = head.data;
			head = head.next ;
			return val;
		}
	}
	public int peek () {
		if(tail == null ) {
			System.out.println("Empty queue");
			return 0;
		}
		else 
			return head.data;
	}
	
}

public class Q1 {

	public static void main(String[] args) {
		//Stack1 s = new Stack1();
		Queue1 s = new Queue1();
		s.push(10);
		s.push(2);
		s.push(3);
		s.push(5);
		System.out.println(s.peek());
		System.out.println(s.pop());
		//s.pop();
		//s.pop();
		System.out.println(s.pop());
	}

}
