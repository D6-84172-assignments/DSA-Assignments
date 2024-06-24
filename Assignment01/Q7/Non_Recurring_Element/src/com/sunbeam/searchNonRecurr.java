package com.sunbeam;

public class searchNonRecurr {
	public static int nonRepeatingElement(int[] arr, int n) {
		
		// TODO Auto-generated method stub
		int count=0;
		for(int i=0; i<n; i++)
		{
			for(int j =0; j<n ; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
				
			}
			//System.out.println("Count for "+arr[i]+ ":"+count);
			
			if(count==1)
			{
				return i;
			}
			count=0;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {1,2,3,-1,2,1,0,4,-1,7,8};
		int index = nonRepeatingElement(arr,arr.length);
		if(index>0)
		{
			System.out.println("first non recurring element is :" + arr[index]);
		}
		else
		{
			System.out.println("everything is repeted");
		}
		
	}

	

}
