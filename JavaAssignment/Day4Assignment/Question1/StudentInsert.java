package Question1;

import java.util.LinkedList;
import java.util.List;

public class StudentInsert {
	List<Student> StudInsert(){
		List<Student> stud = new LinkedList<>();
		stud.add(new Student(2,"Adithya",55));
		stud.add(new Student(5,"Sahil",75));
		stud.add(new Student(6,"Dhruv",58));
		stud.add(new Student(9,"Sanjay",82));
		stud.add(new Student(7,"Vidhya",89));
		return stud;
		
		
	}

}
