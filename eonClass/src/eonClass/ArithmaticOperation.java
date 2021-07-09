package eonClass;

import java.util.Scanner;

public class ArithmaticOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no : ");
		int a=sc.nextInt();
		System.out.println("Enter Second no : ");
		int b=sc.nextInt();

		int add=a+b;
		System.out.println("Addition :"+add);
		int sub=a-b;
		System.out.println("Substraction : "+sub);
		int mul=a*b;
		System.out.println("Multiplication :"+mul);
		int div=a/b;
		System.out.println("Substraction : "+div);2
	}

}
