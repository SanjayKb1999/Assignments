package Day3Assignment;

public class EmpMain {

	public static void main(String[] args) {
		
		Tester Test =new Tester(11,"Sanjay",20000);
		Manager Mgr = new Manager(12,"Vishal",30000);
		Developer Dev= new Developer(13,"Pavan",25000);
		
		
		Mgr.MgrSal();
		Mgr.MgrDisp();
		Dev.DevSalary();
		Dev.DevDisplay();
		Test.TestSal(1000);
		Test.TestDisp();
		
		}

}