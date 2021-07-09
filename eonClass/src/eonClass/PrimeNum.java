package eonClass;

import java.util.Scanner;
//Prime no is divisible by itself or thr is no factorials
public class PrimeNum {

	public static void main(String[] args) {
		
		boolean isPrime=false;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a No :");
		int n=sc.nextInt();
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				isPrime=true;
				break;
			}
		}
		if(!isPrime) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Is not a Prime Number");
		}
	}

}
