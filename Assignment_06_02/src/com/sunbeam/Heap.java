package com.sunbeam;

public class Heap {
	private int size;
	private int[] arr;
	
	public Heap(int size)
	{
		size=0;
		arr = new int[size+1];
	}
	
	public void addHeap(int value)
	{
		size++;
		arr[size]=value;
		int ci = size;
		int pi=ci/2;
		
		while(pi>=1)
		{
			if(arr[pi]<arr[ci])
			{
				break;
			}
			int temp =arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;
			ci=pi;
			pi=ci/2;
		}
	}
	public int getMax()
	{
		return arr[1];
	}
	public int deleteHeap()
	{
		int min =arr[1];
		arr[1] = arr[size];
		arr[size] = min;
		size--;
		int pi=1;
		int ci =pi*2;
		while(ci<size)
		{
			if(ci+1<=size&&arr[ci+1]<arr[ci])
			{
				ci=ci+1;
			}
			int temp =arr[ci];
			arr[ci] = arr[pi];
			arr[pi] = temp;
			pi=ci;
			ci=pi*2;
		}
		
		return min;
	}

}
