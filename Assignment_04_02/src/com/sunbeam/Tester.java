package com.sunbeam;

import java.util.Scanner;

public class Tester {
	public static class Queue{
		

		public void push(List li, int value) {
			// TODO Auto-generated method stub
			li.addFirst(value);
		}

		public void pop(List li, int value) {
			// TODO Auto-generated method stub
			li.deleteLast();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li = new List();
		li.addFirst(10);
		li.addFirst(20);
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter value");
		int value =sc.nextInt();
		Queue q = new Queue();
		q.push(li,value);
		//li.display();
		q.pop(li,value);
		li.display();
	}

}
