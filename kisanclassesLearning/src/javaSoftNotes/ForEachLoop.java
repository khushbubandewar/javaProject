package javaSoftNotes;

public class ForEachLoop {

	public static void main(String[] args) {
		int[] a = {10,20,30,40,50};
		//1.Start for Loop
//		for (int i=0; i<=a.length; i++)
//		{
//			System.out.println(a[i]);
//		}
		
		
		//Start for each Loop
//		for(int x :a)
//		{
//			System.out.println(x);
//		}
		
		//2 FOR LOOP
		int[][] b= {{10,20,30},{60,70,80}};
//		for (int i=0; i<b.length;i++)
//		{
//			for(int j=0; j<b[i].length; j++)
//			{
//				System.out.println(b[i][j]);
//			}
//		}
		
		//2 FOR EACH LOOP
		for(int[] x:b) {
			for(int y:x) {
				System.out.println(y);
			}
		}
		
	}

}
