package eonClass;

import java.util.Scanner;

public class ReverseDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 2 or 3 digit number : ");
		int num =sc.nextInt();
		int rev_num=0;
		if(num!=0){
			num=rev_num%10;
		}
		num=num%10 * 10 +num;
		System.out.println(num);
	}
	

}
