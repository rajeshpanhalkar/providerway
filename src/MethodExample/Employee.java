package MethodExample;

public class Employee {
int empId;
String empName;
double empsal;
int depNo;
String empJob;
public void display() {
	System.out.println("this employee Id is "+empId);
	System.out.println("this  employee Name is "+empName);
	System.out.println("this  employee salary is "+empsal);
	System.out.println("this  employee department number is "+depNo);
	System.out.println("this  employee job number is "+empJob);
}
public static void main(String[]args) {
	Employee emp1=new Employee();
	emp1.empId=100;
	emp1.empName="Rajesh";
	emp1.empsal=50000.123;
	emp1.depNo=1;
    emp1.empJob="tester";
	emp1.display();
	
	
}
}
