package kisanclassesLearning;

public class Encapsulation1Main {

	public static void main(String[] args) {
		Encasulation1 obj = new Encasulation1();
		
		obj.setEmpId(1111);
		int empId = obj.getEmpId();
		System.out.println("Employee ID =====>"+empId);
		
		obj.setEmpName("Khushbu Bandewar");
		String empName = obj.getEmpName();
		System.out.println("Employee Name =====>"+empName);
		
		obj.setEmpSalary(10000);
		double empSal = obj.getEmpSalary();
		System.out.println("Employee Salary is =====>"+empSal);
		
	}

}
