package com.sunbeam;

import java.util.Scanner;

public class selectionSearch {
	public static int searchSelectioKey(int[] arr, int n, int key) {
		//Find out no of comaprison to be take place to find out key
		// TODO Auto-generated method stub
		//initially comaprison will be 0
		int comp = 0;
		for(int i =0 ; i<n; i++)
		{
			comp++;
			if(key==arr[i])
			{
				return comp;
			}
		}
		return comp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,23,45,67,89,89};
		Scanner sc =new Scanner(System.in);
		System.out.println("Ente a key to be search");
		int key = sc.nextInt();
		
		int comp = searchSelectioKey(arr, arr.length,key);
		System.out.println("No of comaparison to be take place: "+ comp);
				
	}

	

}
