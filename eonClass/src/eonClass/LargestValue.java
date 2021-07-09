package eonClass;

import java.util.Scanner;

public class LargestValue {

	public static void main(String[] args) {
		int x,y,z;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of x,y,z  : ");
		x=sc.nextInt();
		y=sc.nextInt();
		z=sc.nextInt();
		if(x>=y && x>=z) {
			System.out.println("X is largest value");
		}
		else if(y>=x && y>=z) {
			System.out.println("Y is largest value");
		}
		else {
			System.out.println("z is largest value");
		}
		
	}

}
