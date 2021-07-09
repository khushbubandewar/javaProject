package eonClass;

import java.util.Scanner;
//perfect no is  a positive integer that is equal to the sum of its positive divisors ex 6=1+2+3 
public class PerfectNo {
	
	public static void main(String[] args) {
		int sum=0;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int n= sc.nextInt();
		for(int i=1; i<=n/2; i++) {
			if(n%i==0) {
				sum= sum+i;
			}
		}
		if(sum==n) {
			System.out.println(n+"  Is a perfect No");
		}
		else {
			System.out.println(n+"  Is not a perfect No ");
		}
		
	}

}
