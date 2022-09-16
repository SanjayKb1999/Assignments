package EmployeeDet;

public class TechnicalEmployee extends Employee {
	String Techskill;
	TechnicalEmployee(int empId, String empName, double BasicPay,int noOfLeaves,String skill){
		super(empId,empName,BasicPay,noOfLeaves);

	}

	@Override
	public double CalculateSalary() {
		double Hra=0.12*BasicPay;
		return BasicPay + Hra;
	}
	public String toString() {
		return empName+"  "+empId;
	}
}