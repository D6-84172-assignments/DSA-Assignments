package assg02;

import java.util.Arrays;

public class Q2 {

	public static int insertionSort(int arr[] , int N) {
		int comp=0;
		for(int i=1;i<N;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] < temp) {
				comp++;
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		return comp;
	}
		
	public static void main(String[] args) {
		int arr[] = {55,44,22,66,11,33};
		int comp = insertionSort (arr,arr.length);
		System.out.println("No of comparisons done : "+comp);
		System.out.println("Sorted Array : "+Arrays.toString(arr));
	}



	
}