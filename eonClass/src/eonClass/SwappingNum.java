package eonClass;

import java.util.Scanner;

public class SwappingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first no : ");
		int a=sc.nextInt();
		System.out.println("Enter Second no : ");
		int b=sc.nextInt();
		int c=a;
		a=b;
		b=c;
		System.out.println(a+"  first no");
		System.out.println(b+"  Second no");
	}

}
