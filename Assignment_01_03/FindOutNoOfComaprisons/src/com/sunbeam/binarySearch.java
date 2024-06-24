package com.sunbeam;

import java.util.Scanner;

public class binarySearch {
	public static int searchBinaryKey(int[] arr, int key, int left, int right) {
		//Use binary search algorithm
		int comp = 0;
		while(left<right)
		{
			 int mid  = (left +right)/2;
			 System.out.println(arr[mid]);
			 comp++;
			 if(key==arr[mid])
			 {
				return comp;
			 }
			 else if(key < arr[mid])
			 {
				 right = mid - 1;
				 
			 }
			 else
			 {
				 left = mid + 1;
			 }
		}
		// TODO Auto-generated method stub
		return comp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,23,45,67,89,87,78,23,45,56};
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a key to be search");
		int key = sc.nextInt();
		
		int comp = searchBinaryKey(arr,key,0,arr.length -1 );
		System.out.println("No of comaparison to be take place: "+ comp);
	}

	

}
