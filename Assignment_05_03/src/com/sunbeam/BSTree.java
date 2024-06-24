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
	public BSTree ()
	{
		root=null;
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
			Node trav= root;
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
						trav= trav.left;
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
						trav= trav.right;
					}
				}
			}
		}
	}
	public void preOrder()
	{
		System.out.print("Preorder::");
		preOrder(root);
		
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
	public Node[] BinarySearchpARENT(int key)
	{
		Node trav=root;
		Node parent =null;
		while(trav!=null)
		{
			if(key==trav.data)
			{
				break;
			}
			parent=trav;
			if(key<trav.data)
			{
				trav=trav.left;
				
			}
			else
			{
				trav=trav.right;
			}
					
		}
		if(trav==null)
		{
			parent =null;
		}
		
		return new Node[] {trav,parent};
	}
	public void deleteNode(int key)
	{
		Node [] arr = BinarySearchpARENT(key);
		
		Node temp =arr[0];
		Node parent=arr[1];
		if(temp==null)
		{
			return;
		}
		if(temp.left!=null && temp.right!=null)
		{
			Node succe = temp.right;
			parent=temp;
			while(succe.left!=null)
			{
				parent =succe;
				succe=succe.left;
				
			}
			temp.data =succe.data;
			temp=succe;
		}
		if(temp.left==null)
		{
			if(temp==root)
			{
				root=temp.right;
			}
			else if(temp==parent.left)
			{
				parent.left=temp.right;
			}
			else if(temp==parent.right)
			{
				parent.right=temp.right;
			}
		}
		if(temp.right==null)
		{
			if(temp==root)
			{
				root=temp.left;
			}
			else if(temp==parent.left)
			{
				parent.left=temp.left;
			}
			else if(temp==parent.right)
			{
				parent.right=temp.left;
			}
		}
		
		
		
	}

}
