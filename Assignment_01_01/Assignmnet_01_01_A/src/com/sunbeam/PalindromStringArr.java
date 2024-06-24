package com.sunbeam;

import java.util.Scanner;

public class PalindromStringArr {
	public static boolean isPalindrome(String str) {
		
		// TODO Auto-generated method stub
		//This approach in worst case time complexity is O(n) and AS(n) = O(1)
		int start = 0;
		int end = str.length()-1;
		while(start<=end)
		{
			//System.out.println(str.charAt(start));
			//System.out.println(str.charAt(end));
			if(str.charAt(start)!=str.charAt(end))
			{
				return false;
			}
			start=(start + 1);
			end = (end -1);
			
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a given string need to be checked");
		String str = sc.next();
		boolean result = isPalindrome(str);
		System.out.println(result);
		if(result)
		{
			System.out.println("Given string is palindrome");
		}
		else
		{
			System.out.println("Given string is not palindrome");
		}
	}

	

}
