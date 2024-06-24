package com.sunbeam;

import java.util.Scanner;

public class Tester {
	public static class Stack
	
	{
		
		public Stack()
		{
			
		}
		public void push(List li,int value)
		{
			
			li.addFirst(value);
		}
		public void pop(List li) {
			// TODO Auto-generated method stub
			li.deleteFirst();
		}
		public void peek(List li) {
			// TODO Auto-generated method stub
			
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new List();
		//stem.out.println("hello");
		li.addFirst(10);
		li.addFirst(20);
		System.out.println("Enter value to be added");
		Scanner sc =new Scanner(System.in);
		int value = sc.nextInt();
		Stack st =new Stack();
		st.push(li,value);
		//st.pop(li);
		//st.peek(li);
		li.display();
		
	}

}
