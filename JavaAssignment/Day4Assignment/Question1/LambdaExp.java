package Question1;

import java.util.List;

public class LambdaExp {
	List<Student> Lmdexp(){
		List<Student> lmda = new StudentInsert().StudInsert();
		System.out.println("Sorted Marks are: ");
		lmda.sort((Student d1, Student d2)->d1.getStdMarks()-d2.getStdMarks());
		return lmda;
	}
public static void main(String args[]) {
	System.out.println(new LambdaExp().Lmdexp());
	
}
}
