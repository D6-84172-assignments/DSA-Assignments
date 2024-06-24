package com.sunbeam;

import java.util.Arrays;

public class selectionSort {
	public static int selectionSortC(int[] arr, int n) {
		// TODO Auto-generated method stub
		int comp=0;
		for(int i=0; i<n-; i++)
		{
			
			for(int j=i+1; j<n-1; j++)
			{
				comp++;
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
		return comp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {11,45,36,12,67};
		System.out.println("Before Sort"+ Arrays.toString(arr));
		int comp=selectionSortC(arr,arr.length);
		System.out.println(comp);
	}

	

}
