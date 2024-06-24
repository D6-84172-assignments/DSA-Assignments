package assg02;

import java.util.Scanner;

class Stack {
	private int arr[];
	private int Size;
	private int Top ;
	public Stack (int size) {
		Size = size;
		arr = new int[Size];
		Top = Size;
	}
	
	public boolean isEmpty() {
		return Top == Size;
	}
	
	public boolean isFull() {
		return Top ==0 ;
	}
	
	public void Push(int value) {
		if(isFull()) {
			System.out.println("Stack is already full.");
			return;
		}
		Top--;
		arr[Top] = value;
		
	}
	
	public int Pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		int value = arr[Top];
		Top++;
		return value;
	}
	public int Peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		int value = arr[Top];
		return value;
	}
}

public class Q5 {

	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Stack : ");
		int size = sc.nextInt();
		Stack q = new Stack(size);
		int choice =1 ;
		while (choice != 0) {
			System.out.print("\n0.Exit\n1.Push\n2.Pop\n3.Peek\nEnter Choice : ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.print("Enter Value to be pushed : ");
				q.Push(sc.nextInt());
				break;
			case 2 :
				System.out.println("The element popped is : "+q.Pop());
				break;
			case 3 :
				System.out.println("The element peeked is : "+q.Peek());
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
