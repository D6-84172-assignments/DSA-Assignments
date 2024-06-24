package com.sunbeam;

import java.util.Scanner;

public class SearchFromLastOccurance {
	public static int searchLast(int[] arr, int n, int key) {
		// TODO Auto-generated method stub
		//Last occurrence of a key 
		//Traversing from end to beginning to search key element
		for(int i=n-1; i>=0; i--)
		{
			
			if(key==arr[i])
			{
				
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {11,33,23,56,34};
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter key need to be search");
	
		int key =sc.nextInt();
		
		int index = searchLast(arr,arr.length,key);
		if(index >= 0)
		{
			System.out.println(index);
		}
		else
		{
			System.out.println("Key not found");
		}

	}

	

}
