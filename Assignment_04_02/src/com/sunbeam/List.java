package com.sunbeam;

import com.sunbeam.List.Node;

public class List {
	public static class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value)
		{
			data=value;
			next=null;
			prev=null;
		}
	}
	
	private Node head;
	private Node tail;
	private int count;
	
	public List()
	{
		head=tail=null;
		count=0;
	}
	
	public boolean isEmpty()
	{
		return head==null && tail ==null;
	}
	public void display()
	{
		if(isEmpty())
		{
			System.out.println("List is empty");
		}
		else {
			Node trav =head;
			while(trav!=null)
			{
				System.out.println(trav.data);
				trav=trav.next;
			}
		}
	}
	public void addFirst(int value)
	{
		Node newnode = new Node(value);
		if(isEmpty())
		{
			head =tail=newnode;
			//newnode.next=newnode.prev=head;
		}
		else
		{
			newnode.next=head;
			head.prev =newnode;
			head=newnode;
		}
	}
	public void deleteLast()
	{
		if(isEmpty())
		{
			return;
		}
		else if(head==tail)
		{
			head=null;
			tail =null;
		}
		else
		{
			tail=tail.prev;
			tail.next=null;
	
		}
	}
		
		
		
				
	
}

