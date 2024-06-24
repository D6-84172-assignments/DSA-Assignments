package assg02;

import java.util.Scanner;

class Stack2 {
	private int arr[];
	private int max_arr[];
	private int Size;
	private int Top ;
	public Stack2 (int size) {
		Size = size;
		arr = new int[Size];
		max_arr = new int[Size];
		Top = -1;
	}
	
	public boolean isEmpty() {
		return Top < 0;
	}
	
	public boolean isFull() {
		return Top == Size-1 ;
	}
	
	public void Push(int value) {
		if(isFull()) {
			System.out.println("Stack is already full.");
			return;
		}
		Top++;
		arr[Top] = value;
		if(Top == 0)
			max_arr[0] = value;
		else if( Top >=1 && max_arr[Top-1] < value ) {
			max_arr[Top] = value;
		}
		else {
			max_arr[Top] = max_arr[Top-1] ;
		}
	}
	
	public int Pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		int value = arr[Top];
		Top--;
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
	public int PeekMax() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		int value = max_arr[Top];
		return value;
	}
}

public class Q6 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Stack : ");
		int size = sc.nextInt();
		Stack2 q = new Stack2(size);
		int choice =1 ;
		while (choice != 0) {
			System.out.print("\n0.Exit\n1.Push\n2.Pop\n3.Peek\n4.Get Maximim\nEnter Choice : ");
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
			case 4 :
				System.out.println("The maximum value of all elements is  : "+q.PeekMax());
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
