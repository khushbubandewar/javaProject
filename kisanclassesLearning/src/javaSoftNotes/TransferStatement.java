package javaSoftNotes;

public class TransferStatement {

	public static void main(String[] args) {
		//BREAK Statement
		
//		for(int i=0; i<=10; i++) {
//			if(i==5) {
//				break;
//			}
//			System.out.println(i);
		
//			int i=0;
//			System.out.println("hello");
//			if (i==10) {
//				break ;
//			}
//			System.out.println("hy");
		//*****************************************************************
		
		//CONTINUE Statement
		
//		for(int i=1; i<=10; i++) {
//			if(i%2==0) {
//				continue;
//			}
//			System.out.println(i);
//		}
		
		for(int i=1; i<=3; i++) {
			for(int j=1; j<3; j++) {
				if(i==j) {
					break;
				}
				System.out.println(i+"-----------------"+j);
			}
		}
	}

}
