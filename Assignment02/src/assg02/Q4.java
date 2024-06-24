package assg02;

import java.util.Scanner;

class Queue{
private int arr[];
private int  Front , Rear;
private int Size;
public Queue(int size) {
	Size = size;
	arr = new int [Size];
	Front = Rear = 0;
}

public boolean isEmpty() {
	return Front == Rear;
}

public boolean isFull() {
	return Rear == Size ;
}

public int Peek() {
	if(isEmpty()) {
		System.out.println("The Array is Empty");
		return 0 ;
	}
	return arr[Front];
}

public int Pop() {
	if(isEmpty()) {
		System.out.println("The Array is Empty");
		return 0 ;
	}
	int value = arr[Front];
	Front++;
	return value;
}

public void Push(int value) {
	if(isFull()) {
		System.out.println("The Array is Already Full");
		return ;
	}
	arr[Rear] = value;
	Rear++;
}

}

public class Q4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Queue : ");
		int size = sc.nextInt();
		Queue q = new Queue(size);
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
