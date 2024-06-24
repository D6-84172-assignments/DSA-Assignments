package com.sunbeam;

import java.util.Scanner;

public class PalindromeIterativeNumber {
	public static boolean isPalindrome(int num) {
		// TODO Auto-generated method stub
		//In this case time complexity depends on how many digits in number
				//if there are n digit in string then it will take n iterations O(n)
		
		int rev = 0;
		while(num>0)
		{
			int a = num % 10;
			//System.out.println(a);
			rev = (rev * 10 + a);
			//System.out.println(rev);
			num = num /10;
		}
		System.out.println(rev);
		if(rev==num)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter No to be check ");
		int num =sc.nextInt();
		boolean result = isPalindrome(num);
		if(result)
		{
			System.out.println("Given no is palindrome");
		}
		else
		{
			System.out.println("Given no is not palindrome");
		}
			

	}

	

}
