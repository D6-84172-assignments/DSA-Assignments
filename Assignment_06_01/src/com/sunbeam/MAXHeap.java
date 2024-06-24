package com.sunbeam;

public class MAXHeap {
	private int size;
	public MAXHeap()
	{
		size=0;
	}
	public void addHeap(int[]arr)
	{
		size++;
		int ci=size;
		int pi=ci/2;
		
		while(pi>=1)
		{
			if(arr[ci]<arr[pi])
			{
				break;
			}
			int temp = arr[ci];
			arr[ci]=arr[pi];
			arr[pi]=temp;
			ci=pi;
			pi=ci/2;
		}
	}
	public int deleteHeap(int[]arr)
	{
		int max = arr[1];
		arr[1]=arr[size];
		arr[size]=max;
		size--;
		int pi=1;
		int ci =pi*2;
		
		while(ci<=size)
		{
			if(ci+1<=size && arr[ci+1]>arr[ci])
			{
				ci = ci+1;
			}
			if(arr[pi]>arr[ci])
			{
				break;
			}
			int temp = arr[ci];
			arr[ci]=arr[pi];
			arr[pi]=temp;
			pi=ci;
			ci=pi*2;
			
		}
		return max;
		
		
	}
	public void heapSort(int arr[]) {
		//1. create heap
		for(int i = 1 ; i < arr.length ; i++)
			addHeap(arr);
		//2. delete heap
		for(int i = 1 ; i < arr.length ; i++)
			deleteHeap(arr);
	}

	

}
