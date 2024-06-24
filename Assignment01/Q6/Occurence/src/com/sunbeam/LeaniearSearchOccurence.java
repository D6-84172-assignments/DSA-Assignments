package com.sunbeam;

import java.util.Scanner;

public class LeaniearSearchOccurence {

	public static int searchOccurence(int[] arr, int n, int key) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(key==arr[i])
			{
				count++;
			}
			
			
		}
		if(count==0)
		{
			return -1;
		}
		else {
			return count;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {11,23,56,11,23,78,98,23,56};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter key to check for occurence");
		int key = sc.nextInt();
		
		int occ = searchOccurence(arr, arr.length,key);
		System.out.println("Occurence of given no "+key+" is: "+occ);
	}


}
