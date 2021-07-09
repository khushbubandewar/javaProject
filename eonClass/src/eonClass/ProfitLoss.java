package eonClass;

import java.util.Scanner;

public class ProfitLoss {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the cost Price : ");
		double cp=sc.nextDouble();
		System.out.println("Enter the Selling price : ");
		double sp= sc.nextDouble();
		if(cp-sp>0) {
			System.out.println("loss : "+(cp-sp));
		}
		else if(cp-sp<0) {
			System.out.println("Profit : "+(cp-sp));
		}
		else {
			System.out.println("No profit no loss");
		}
	}

}
