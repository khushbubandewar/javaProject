package eonClass;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter unit of Electricity bill : ");
		float unit=sc.nextFloat();
		if(unit<=50) {
			double amt = unit*0.50;
			System.out.println("Charge :"+amt);
		}else if(unit<=150) {
			double amt = 25+(unit-50)*0.75;
			System.out.println("Charge : "+amt);
		}
		else if(unit<=250) {
			double amt=unit*1.20;
			System.out.println("Charge : "+amt);
		}
		else {
			double amt=unit*1.50;
			System.out.println("Charge : "+amt);
		}
	}

}
