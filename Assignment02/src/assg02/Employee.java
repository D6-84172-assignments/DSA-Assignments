package assg02;

public class Employee {
public int EmpNo ;
public String Name ;
public Double Salary ;
public Employee(int empNo, String name, Double salary) {
	super();
	EmpNo = empNo;
	Name = name;
	Salary = salary;
}
@Override
public String toString() {
	return "\nEmployee [EmpNo=" + EmpNo + ", Name=" + Name + ", Salary=" + Salary + "]";
}
}
