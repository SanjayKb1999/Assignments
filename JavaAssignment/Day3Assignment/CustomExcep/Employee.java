package CustomExcep;

public class Employee {
	 public static void CalSal(int empSal) throws EmpException{
		
		 if(empSal<100000)
			 throw new EmpException(" Enter Salary more than 100000");
		 else
			 System.out.print("Employee Salary is: "+empSal);
			
	 }
		public static void main(String[] args) throws EmpException {
			CalSal(99999);
		}

	}
