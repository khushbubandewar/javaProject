package acadmic;

public class C {
public static void main(String[] args) {
	C c1=new C();
	c1.test();
	C.test1();
}
public void test() {
	System.out.println("Print test");
}
public static void test1() {
	System.out.println("PRINT TEST 1");
}

}
