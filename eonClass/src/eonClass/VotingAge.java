package eonClass;

import java.util.Scanner;

public class VotingAge {

	public static void main(String[] args) {
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age : ");
		age= sc.nextInt();
		if(age>18) {
			System.out.println("Eligible for voting");
		}else {
			System.out.println("Note eligible for voting");
		}
	}

}
