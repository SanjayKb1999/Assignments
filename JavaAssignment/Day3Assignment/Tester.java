package Day3Assignment;

public class Tester extends Employee{
	double testerSal;
	Tester(int empId,String empName,double empSal){
		super(empId,empName,empSal);
	}
	public double TestSal(int empSal) {
		testerSal =empSal*9;
		return testerSal ;
		
	}
	public void  TestDisp() {
		System.out.println("Employee Id: "+empId+"\tName: " +empName);
		System.out.println("Salary of tester: " +testerSal);
	}
	
}