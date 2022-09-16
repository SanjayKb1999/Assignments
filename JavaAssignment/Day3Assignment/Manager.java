package Day3Assignment;

class Manager extends Employee{ 
	double ManagerSal;

	Manager(int empId,String empName,double empSal){
		super(empId,empName,empSal);
	}
	public double MgrSal() {
		ManagerSal =empSal*15;
		return ManagerSal ;
		
	}
	public void  MgrDisp() {
		System.out.println("Employee Id: "+empId+"\tName: "+empName);
		System.out.println("Salary of Manager: "+ManagerSal);
	}
	
}
