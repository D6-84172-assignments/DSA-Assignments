package com.sunbeam;

import java.util.Scanner;

public class Tester {
	public static class Deque{

		public void pushb(List li, int value) {
			// TODO Auto-generated method stub
			li.addLast(value);
		}

		public void pushf(List li, int value) {
			// TODO Auto-generated method stub
			li.addFirst(value);
		}

		public void popf(List li) {
			// TODO Auto-generated method stub
			li.deleteFirst();
		}

		public void popb(List li) {
			// TODO Auto-generated method stub
			li.deleteLast();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List li =new List();
		li.addFirst(10);
		li.addFirst(20);
		li.addFirst(30);
		li.addFirst(40);
		
		Deque dq = new Deque();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter valuele to be added");
		int value =sc.nextInt();
		//dq.pushf(li,value);
		dq.pushb(li,value);
		//dq.popf(li);
		dq.popb(li);
		
		li.display();
		
				
		
	}

}
