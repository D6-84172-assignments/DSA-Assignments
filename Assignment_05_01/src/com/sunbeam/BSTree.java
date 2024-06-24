package com.sunbeam;

public class BSTree {
	public static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int value) {
			data=value;
			left=right=null;
			
		}
	}
	private Node root;
	public BSTree()
	{
		root=null;
	}
	
	public boolean isEmpty()
	{
		return root==null;
	}
	
	public void DeleteAll()
	{
		root = null;
	}
	public void addNode(int value)
	{
		if(root==null)
		{
			root = new Node(value);
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
	
	public void preOrder()
	{
		System.out.println("Preorder::");
		
		preOrder(root);
		
		System.out.println(" ");
	}

	public void preOrder(Node trav) {
		// TODO Auto-generated method stub
		if(trav==null)
		{
			return;
			
		}
		System.out.print(trav.data+" ");
		preOrder(trav.left);
		preOrder(trav.right);
		
	}
	public void postOrder()
	{
		System.out.println("Postorder::");
		
		postOrder(root);
		
		System.out.println(" ");
	}

	public void postOrder(Node trav) {
		// TODO Auto-generated method stub
		if(trav==null)
		{
			return;
			
		}
		
		postOrder(trav.left);
		postOrder(trav.right);
		System.out.print(trav.data+" ");
	}
	public void inOrder()
	{
		System.out.println("Inorder::");
		
		inOrder(root);
		
		System.out.println(" ");
	}

	public void inOrder(Node trav) {
		// TODO Auto-generated method stub
		if(trav==null)
		{
			return;
			
		}
		
		inOrder(trav.left);
		System.out.print(trav.data+" ");
		inOrder(trav.right);
		
	}
		
}
