package com.sunbeam;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BSTree t =new BSTree();
		System.out.println("hello");
		t.AddNode(8);
		
		t.AddNode(3);
		
		t.AddNode(6);
		System.out.println(t.isEmpty());
		t.AddNode(1);
		t.AddNode(14);
		t.AddNode(13);
		t.AddNode(7);
		t.AddNode(4);
		
		t.preorder();
	
	}

}
