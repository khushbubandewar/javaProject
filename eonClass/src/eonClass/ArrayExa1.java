package eonClass;

import java.util.Scanner;

public class ArrayExa1 {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int i;
		int min=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Array Elements : ");
		for(i=0; i<5; i++) {
			arr[i] =sc.nextInt();
		}
		System.out.println("----------Elements--------");
		for(i=0; i<5; i++) {
			System.out.println(arr[i]);
		}
		for(int j=i; j<5; j++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum no is : "+min);
		
	}

}
