package com.sunbeam;

public class BSTRee {
	public static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value)
		{
			data=value;
			left=right=null;
			
		}
	}
	private Node root;
	
	public BSTRee() {
		root =null;
		
	}
	public boolean isEmpty()
	{
		return root==null;
	}
	public void addNode(int value)
	{
		if(root==null)
		{
			root=new Node(value);
		}
		else
		{
			addNode(root,value);
		}
	}
	public void addNode(Node trav, int value) {
		
		// TODO Auto-generated method stub
		if(value<trav.data)
		{
			if(trav.left==null)
			{
				trav.left=new Node(value);
				return;
			}
			else
			{
				addNode(trav.left,value);
			}
		}
		else
		{
			if(trav.right==null)
			{
				trav.right=new Node(value);
				return;
			}
			else
			{
				addNode(trav.right,value);
			}
		}
		
	}
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);	// V
		preorder(trav.left);	// L
		preorder(trav.right);	// R
	}
	
	public void preorder() {
		System.out.print("Preorder : ");
		preorder(root);
		System.out.println("");
	}

}
