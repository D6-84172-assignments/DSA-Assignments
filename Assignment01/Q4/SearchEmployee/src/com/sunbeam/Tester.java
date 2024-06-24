package com.sunbeam;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Tester {
	public static void SearchEmployee(Employee[] arr, int n, int Empid) {
		// TODO Auto-generated method stub
		//Employee emp = new Employee();
		for (Employee employee : arr) {
			if(Empid==employee.empid)
			{
				System.out.println(employee.empid);
				employee.Display();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size =sc.nextInt();
		Employee arr[]= new Employee[size];
		Employee emp =new Employee();
		
		for(int i=0; i< size;i++)
		{
			
			emp.Accept(sc);
			arr[i]=emp;
		}
		
		System.out.println("Enter Empid need to be search");
		int Empid = sc.nextInt();
		
		SearchEmployee(arr,size,Empid);
	}

	

}
