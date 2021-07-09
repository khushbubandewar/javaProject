package javaSoftNotes;

public class BitwiseOperator {

	public static void main(String[] args) {
//		int x=10;
//		int y=15;
//		
//		if(++x>10 & ++y<15)
//		{
//			++x;
//		}
//		else {
//			++y;
//		}
//		System.out.println(x+"**************************************"+y);
		
		
		int x=10;
		if((++x < 10)&&(x/0 > 10))
		{
			System.out.println("hello");
		}
		else {
			System.out.println("hy");
		}
	
	}

}
