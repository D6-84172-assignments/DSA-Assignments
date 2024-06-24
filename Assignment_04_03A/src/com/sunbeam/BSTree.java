package com.sunbeam;

public class BSTree {
	public static class Node{
		private int data;
		private Node left;
		private Node right;
		public Node(int value)
		{
			left=null;
			right=null;
			data=value;
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
	public void AddNode(int value)
	{
		Node newnode = new Node(value);
		
		
			if(root==null)
			{
				root = newnode;
			}
			else
			{
				Node trav =root;
				while(true) {
				if(value < trav.data) {
					if(trav.left==null)
					{
						trav.left=newnode;
						break;
					}
					else
					{
						trav=trav.left;
					}
				}
				else {
					if(trav.right==null)
					{
						trav.right=newnode;
						break;
					}
					else
					{
						trav=trav.right;
					}
				}
				
			}
		}
		
	}
	public void preorder(Node trav) {
		if(trav == null)
			return;
		System.out.print(" " + trav.data);
		preorder(trav.left);
		preorder(trav.right);
	}
	
	public void preorder() {
		System.out.print("Preorder :: ");
		preorder(root);
		System.out.println("");
	}
	
	public void DeleteAll()
	{
		root=null;
	}
	
	
	

}
