package javaSoftNotes;

public class VarArgs {

//	public static void sum(int... x) {
//		int total =0;
//		for(int y :x)
//		{
//			total=total+y;
//		}
//		System.out.println("The Sum  :  "+total);
//	}
//	public static void main(String[] args) {
//		sum();
//		sum(10,20);
//		sum(20,30,40);
//		sum(30,40,50);
//	}
	
//	final static strictfp synchronized public void main(String... A) {
//		System.out.println("HELLO METHOD");
//	}

	
	
	public static void main(String[] args) {
		String[] argb = {"A" ,"B"};
	//	args =argb;
		for(String s1:argb) {
			System.out.println(s1);
		}
	}
}
