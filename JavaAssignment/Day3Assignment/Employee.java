package Day3Assignment;
public class Employee {
	int empId;
	String empName;
	double empSal;
	Employee(){}
	Employee(int empId, String empName, double empSal){
		this.empId=empId;
		this.empName=empName;
		this.empSal=empSal;
	}
	public double salCal() {
		return empSal;
	}
	public void display() {
			}

}