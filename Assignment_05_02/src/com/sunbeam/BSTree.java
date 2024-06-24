package com.sunbeam;

public class BSTree {
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
	public BSTree()
	{
		root=null;
	}
	public boolean isEmpty()
	{
		return root==null;
	}
	public void addNode(int value)
	{
		Node newnode = new Node(value);
		if(root==null)
		{
			root=newnode;
		}
		else
		{
			Node trav = root;
			while(true)
			{
				if(value<trav.data)
				{
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
				else
				{
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
	public void preOrder()
	{
		System.out.print("Preorder::");
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
	public Node binarySearch(int key)
	{
		Node trav =root;
		while(trav!=null)
		{
			if(key==trav.data)
			{
				return trav;
			}
			else if(key<trav.data)
			{
				trav=trav.left;
			}
			else if(key>trav.data)
			{
				trav=trav.right;
			}
		}
		return null;
	}
	
	public Node BinarySearch(int key)
	{
		if(root==null)
		{
			return null;
		}
		else
		{
			Node ret =BinarySearch(root,key);
			return ret;
		}
	}
	public Node BinarySearch(Node trav, int key) {
		// TODO Auto-generated method stub
		if(key==trav.data)
		{
			return trav;
		}
		else if(key<trav.data)
		{
			trav = trav.left;
			return BinarySearch(trav, key);
		}
		else if(key >trav.data)
		{
			trav=trav.right;
			return BinarySearch(trav,key);
		}
		return null;
		
	}

}
