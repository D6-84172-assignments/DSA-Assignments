package Assignment01;

import java.util.Scanner;

public class Q2 {
		
		public static int linearSearch(int arr[], int N, int key) {
			for(int i=N-1;i<N;i--) {
				
				if(key == arr[i])
					return i;
			}
			return -1;
		}
		public static void main(String[] args) {
			int arr[] = {10, 20, 50, 30, 10, 20, 10, 50, 60, 30, 50,};
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter key to be searched : ");
			int key = sc.nextInt();
			
			int index = linearSearch(arr, arr.length, key);
			if(index != -1)
				System.out.println("Key is found at index : " + index);
			else
				System.out.println("Key is not found");
			
			sc.close();
		}	
}