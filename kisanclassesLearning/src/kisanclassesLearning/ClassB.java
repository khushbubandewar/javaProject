package kisanclassesLearning;

public class ClassB {
	boolean meth2(int []arr) {
		if(arr[0]==2||arr[1]==3)
		{
			return true;
		}
		else
			return false;
		
	}
	public static void main(String[] args) {
		ClassB obj= new ClassB();
		int arr[]= {1,2};
		boolean result=obj.meth2(arr);
		System.out.println(result);
		

	}

}
