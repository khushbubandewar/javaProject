package eonClass;

import java.util.Scanner;

public class Avg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no : ");
		int b=sc.nextInt();
		System.out.println("Enter 3rd no : ");
		int c=sc.nextInt();
		System.out.println("Enter 4rth no : ");
		int d=sc.nextInt();
		System.out.println("Enter 5th no : ");
		int e=sc.nextInt();
		 
		int avg=(a+b+c+d+e)/5;
		System.out.println(avg);
	}

}
