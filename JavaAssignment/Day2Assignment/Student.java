package Day2Assignment;

public class Student {
	int stdID;
    String stdName;
	String stdClass;
	
	public static void main(String[] args) {
		Student w = new Student();
		w.stdID= 11;
		w.stdName="Ajay";
		w.stdClass="VII";
		System.out.println("Student ID: " +w.stdID+"\tStudent Name: " +w.stdName+ "\tStudent Class: "+w.stdClass );
		Student q = new Student();
		q.stdID= 14;
		q.stdName="Vijay";
		q.stdClass="X";
		System.out.println("Student ID: " +q.stdID+ "\tStudent Name: " +q.stdName+ "\tStudent Class: " +q.stdClass );
		
	}

}
