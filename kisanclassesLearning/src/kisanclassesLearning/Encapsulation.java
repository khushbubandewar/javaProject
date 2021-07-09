package kisanclassesLearning;

public class Encapsulation {
	private int studentRollnumber;	//instance variable
	public int getStudentRollnumber() {
		return studentRollnumber;
	}
	public void setStudentRollnumber(int studentRollnumber) {
		this.studentRollnumber = studentRollnumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {	//local variable
		this.studentName = studentName;
	}
	private String studentName;
	int collegeCode;
	
	
}
