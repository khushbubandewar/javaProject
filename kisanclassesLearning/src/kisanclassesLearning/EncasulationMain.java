package kisanclassesLearning;

public class EncasulationMain {

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.collegeCode=500;
		
		obj.setStudentRollnumber(100);
		int studentNumber = obj.getStudentRollnumber();
		System.out.println("Roll number is====>"+studentNumber);
		
		obj.setStudentName("KHUSHBU");
		String name=obj.getStudentName();
		System.out.println("Student name is====>"+name);
	}

}
