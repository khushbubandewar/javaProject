package eonClass;

import java.util.Scanner;

public class CalculateSalary {

	public static void main(String[] args) {
		float salary,bonus,update;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary Amt : ");
		 salary = sc.nextFloat();
		 if(salary>20000) {
			 bonus = (float)(0.10*20000);
			 update= bonus+salary;
			 System.out.println("Incremented salary with 10% bonus : "+update);
			 
		 }else{
			 System.out.println("Salary is not greater than 20000");
		 }
		
	}

}
