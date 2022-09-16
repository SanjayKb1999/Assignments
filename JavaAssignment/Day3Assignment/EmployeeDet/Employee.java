package EmployeeDet;

public abstract class Employee {

	int empId;
	String empName;
	double BasicPay;
	int noOfLeaves;
	Employee(int empid, String empName, double BasicPay,int noOfLeaves){
		this.empId=empid;
		this.empName=empName;
		this.BasicPay=BasicPay;
		this.noOfLeaves=noOfLeaves;
	}
	public abstract double CalculateSalary();
}
