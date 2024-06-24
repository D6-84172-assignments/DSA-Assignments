package com.sunbeam;

import java.util.Scanner;

public class Employee {
	int empid;
	String name;
	double salary;
	
	public Employee()
	{
		
	}
	public Employee(int empid, String name, double salary) {
		
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public void Accept(Scanner sc)
	{
		System.out.println("Enter Employee ID");
		empid=sc.nextInt();
		System.out.println("Enter Employee Name");
		name=sc.next();
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
		
	
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	public void Display()
	{
		System.out.println(toString());
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Employee Details :[ Empid:"+empid+", Name: "+name+", Salary: "+salary+"]";
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
		
		
	
	
	

}
