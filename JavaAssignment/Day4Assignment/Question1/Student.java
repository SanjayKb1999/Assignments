package Question1;

public class Student {
	int stdId;
	String stdName;
	int stdMarks;
	
	public Student(int stdId, String stdName, int stdMarks) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.stdMarks = stdMarks;
	}
	public int getStdId() {
		return stdId;
	}
	public void setStdId(int stdId) {
		this.stdId = stdId;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public int getStdMarks() {
		return stdMarks;
	}
	public void setStdMarks(int stdMarks) {
		this.stdMarks = stdMarks;
	}
	@Override
	public String toString() {
		return "Student [stdId= " + stdId + ", stdName= " + stdName + ", stdMarks= " + stdMarks + "]";
	}
	
	

}
