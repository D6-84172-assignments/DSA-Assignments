package assg02;

import java.util.Arrays;

public class Q3 {

	public static void insertionSort(Employee emp[],int N) {
		for(int i=1;i<N;i++) {
			double temp = emp[i].Salary ;
			Employee e = emp[i];
			int j = i-1;
			while(j>=0 && emp[j].Salary > temp ) {
				emp[j+1] = emp [j];
				j--;
			}
			emp[j+1] = e ;
		}
	}
	public static void main(String[] args) {
		Employee emp[] = new Employee[6];
		emp[0] = new Employee(1,"Amit",5000.00);
		emp[1] = new Employee(2,"Balaji",4000.00);
		emp[2] = new Employee(3,"Chandan",2000.00);
		emp[3] = new Employee(4,"Dinesh",6000.00);
		emp[4] = new Employee(5,"Eion",1000.00);
		emp[5] = new Employee(6,"Farhan",3000.00);
		
		insertionSort(emp, emp.length);
		System.out.println("Sorted array of Employees : "+Arrays.toString(emp));
	}
}
