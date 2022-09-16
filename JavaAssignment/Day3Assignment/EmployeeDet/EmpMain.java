package EmployeeDet;

public class EmpMain {

	public static void main(String[] args) {
		
		TechnicalEmployee tech =new TechnicalEmployee(22,"Vikrant",30000,2,"RDBMS");
		Staff st =new Staff(11,"Vijay",4000,5);
		Address addr = new Address(175,"Bangalore","Ulsoor",560042);
		Address addr2 = new Address(199,"Bangalore","Banaswadi",560042);
		System.out.println(addr.toString());
		System.out.println(tech.toString());
		System.out.println("Technical staff salary:\t"+tech.CalculateSalary()+"\n");
	    System.out.println(addr2.toString());
		System.out.println(st.toString());
		System.out.println("Staff salary:\t"+st.CalculateSalary());
		
		
	}

}
