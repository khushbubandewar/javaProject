package eonClass;

import java.util.Scanner;

public class AccendingDecendingex {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three values");
		int x=sc.nextInt();
		int y= sc.nextInt();
		int z= sc.nextInt();
		if(x<y && y<z) {
			System.out.println("Accending order  ");
		}
		else if(x>y && y>z) {
			System.out.println("Decending order  ");
		}
		else {
			System.out.println("Not any order");
		}
	}

}
