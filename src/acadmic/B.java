package acadmic;

public class B {
	int i = 2;
	static int j = 5;
	int k = 9;

	public static void main(String[] args) {
		B b1 = new B();
		System.out.println(b1.i);
		B b2 = new B();
		System.out.println(b2.i);
		System.out.println(b2.k);
		System.out.println(B.j);
	}
}
