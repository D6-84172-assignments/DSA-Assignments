package com.sunbeam;

import java.util.Scanner;

public class binarySearchD {
	public static int binarySearchDesc(int[] arr, int key, int left, int right) {
		// TODO Auto-generated method stub
		while(left<=right)
		{
			int mid =(left + right)/2;
			//System.out.println(mid);
			if(key==arr[mid])
			{
				return mid;
			}
			else if(key>arr[mid])
			{
				right = mid-1;
				
			}
			else {
				left = mid + 1;
			
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr [] = {55,44,33,22,11};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the key need to be search");
		int key =sc.nextInt();
		
		int index = binarySearchDesc(arr,key,0,arr.length-1);
		
		if(index>=0)
		{
			System.out.println(index);
		}
		else
		{
			System.out.println("Key not found");
		}
		
	}

	

}
