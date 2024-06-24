package com.sunbeam;

import java.util.Scanner;

public class SearchRank {
	public static int searchRankElement(int[] arr, int n,int key) {
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<n; i++)
		{
			if(key>=arr[i])
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,20,15,3,4,4,1};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element whose rank to be calculated");
		int element =sc.nextInt();
		
		int rank = searchRankElement(arr, arr.length,element);
		System.out.println("Rank of an element:"+element+"is:"+rank);
	}

	

}
