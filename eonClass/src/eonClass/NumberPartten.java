package eonClass;

public class NumberPartten {

	public static void main(String[] args) {
		int k=5;
		for(int i=0; i<k; i++) {
			for(int j=k-i; j>1; j--) {
				System.out.print(" ");
			}
			for(int j=0; j<=i; j++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
