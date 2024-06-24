package assg02;

import java.util.Scanner;

class CircularQueue{
	private int arr[];
	private int front , rear , count ;
	private final int Size ;
	public CircularQueue(int size) {
		Size = size ;
		front = rear = 0;
		count =  0;
		arr = new int [Size];
	}
	public boolean isEmpty() {
		return count ==0;
	}
	public boolean isFull() {
		return count == Size;
	}
		public void push(int value) {
			if (isFull()) {
				System.out.println("Queue is full ...");
		        return ; 	
			}
			arr[rear] = value;
			rear = (rear+1)%Size;
			count++;	
		}
		public int pop() {
			if(isEmpty()) {
				System.out.println("Queue is empty...");
			    return -1;
			}
			int value = arr[front];
			front = (front+1)%Size;
			count--;
			return value;	
		}
		public int peek() {
			if(isEmpty()) {
				System.out.println("Queue is empty...");
			    return -1;
			}
			int value = arr[front];
			return value;	
		}
}

public class Q8 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter size of circular Queue : ");
	CircularQueue q = new CircularQueue(sc.nextInt());
	int choice =1 ;
	while (choice != 0) {
		System.out.print("\n0.Exit\n1.Push\n2.Pop\n3.Peek\nEnter Choice : ");
		choice = sc.nextInt();
		switch(choice) {
		case 1 :
			System.out.print("Enter Value to be pushed : ");
			q.push(sc.nextInt());
			break;
		case 2 :
			System.out.println("The element popped is : "+q.pop());
			break;
		case 3 :
			System.out.println("The element peeked is : "+q.peek());
			break;	
		case 0 :
			System.out.println("Thank you");
			break;
		default :
			System.out.println("Wrong input choice ...");
			break;
		}
}
}
}
