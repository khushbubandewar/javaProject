package eonClass;

import java.util.Scanner;

public class PrintWeird {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		if(n%2!=0) {
			System.out.println("Weird");
		}else if(n<=5 && n>=2) {
			System.out.println("Not Weird");
		}else if(n<=20 && n>=6) {
			System.out.println("Weird");
		}else if(n>20) {
			System.out.println("Not Weird");
		}
	}

}
