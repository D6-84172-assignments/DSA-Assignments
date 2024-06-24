package assg02;

import java.util.Arrays;
import java.util.Scanner;

class Stack1 {
	private int arr[];
	private int Size;
	private int Top ;
	public Stack1 (int size) {
		Size = size;
		arr = new int[Size];
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
}

public class Q7 {
    public static void main(String[] args) {
    	int arr[] = {1,2,3,4,5,6};
    	System.out.println("Array before reversing : "+Arrays.toString(arr));
    	Stack1 s = new Stack1(arr.length);
    	for(int i=0;i<arr.length;i++) {
    	  s.Push(arr[i]);
    	}
    	for(int i=0;i<arr.length;i++) {
      	  arr[i] = s.Pop();
      	}
    	System.out.println("Array after reversing : "+Arrays.toString(arr));
	}
}
