package EmployeeDet;

public class Staff extends Employee {
	Staff(int empId, String empName, double BasicPay, int noOfLeaves) {
		super(empId, empName, BasicPay, noOfLeaves);
	}

	@Override
	public double CalculateSalary() {
		double Hra = 0.18* BasicPay;
		return BasicPay+ Hra;
	}
	public String toString() {
		return empName+"  "+empId;
	}

}
