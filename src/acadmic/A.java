package acadmic;

public class A {
	int i = 10;
	static int j = 100;

	public static void main(String[] args) {
		A a1 = new A();
		System.out.println(a1);//display memory address of object 
		A a2 = new A();
		System.out.println(a2.i);//display content
		System.out.println(A.j);

	}
}
