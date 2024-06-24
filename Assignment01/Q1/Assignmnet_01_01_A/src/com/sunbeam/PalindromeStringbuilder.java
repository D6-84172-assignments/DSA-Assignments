package com.sunbeam;

import java.util.Scanner;

public class PalindromeStringbuilder {
	public static boolean isPalindrome(String str) {
		//In this case time complexity depends on how many character on string
		//if there are n charter in string then it will take n iterations O(n)
		//as StringBuilder create extra String hence AS(n)=O(n)
		StringBuilder rev =new StringBuilder(str);
		rev.reverse();
		
		if(str.equals(rev.toString()))
		{
			return true;
		}
		// TODO Auto-generated method stub
		return false;
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
