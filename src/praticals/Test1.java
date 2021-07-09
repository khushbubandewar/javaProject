package praticals;

public class Test1 {
	public static void main(String argv[]) {
		Test1[] t1 = new Test1[10];
		Test1[][] t2 = new Test1[5][];
		if (t1[0] == null) {
			t2[0] = new Test1[10];
			t2[1] = new Test1[10];
			t2[2] = new Test1[10];
			t2[3] = new Test1[10];
			t2[4] = new Test1[10];
		}
		System.out.println(t1[0]);
		System.out.println(t2[1][0]);
	}
}
