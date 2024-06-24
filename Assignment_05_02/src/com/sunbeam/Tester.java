package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTree bst =new BSTree();
		bst.addNode(8);
		bst.addNode(3);
		bst.addNode(10);
		bst.addNode(6);
		bst.addNode(1);
		bst.addNode(14);;
		bst.addNode(13);
		bst.addNode(7);
		bst.addNode(4);
		bst.preOrder();
		
		BSTree.Node ret=bst.BinarySearch(6);
		if(ret==null)
		{
			System.out.println("Key not found");
		}
		else
		{
			System.out.println("key is found");
		}
	}

}
