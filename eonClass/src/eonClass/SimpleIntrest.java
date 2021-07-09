package eonClass;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of P  : " );
		int p=sc.nextInt();
		System.out.println("Enter the value of r : ");
		int r =sc.nextInt();
		System.out.println("Enter the value of t : ");
		int t=sc.nextInt();
		long SI=(p*r*t)/100;
		System.out.println("Simple Intrest Is : "+SI);
	}

}
