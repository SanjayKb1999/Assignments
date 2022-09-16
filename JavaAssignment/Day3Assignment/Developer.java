package Day3Assignment;

public class Developer extends Employee{
	double developerSal;
	Developer(int empId,String empName,double empSal){
		super(empId,empName,empSal);
		
	}
	public double DevSalary() {
		developerSal =empSal*10;
		return developerSal ;
	}
	public void  DevDisplay() {
		System.out.println("Employee Id: "+empId+"\tName: "+empName);
		System.out.println("Salary of Devloper: "+developerSal);
	}
}