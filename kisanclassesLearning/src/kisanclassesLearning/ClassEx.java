package kisanclassesLearning;
//Given the array of integer return the sum of the first 2 in the array. 
//if the array length is less than2 ,just sum up the element that exist ,
//return 0 if the array length is 0.
public class ClassEx {
	int meth3(int []arr)
	{
	if(arr.length>=2)
	{
		return arr[0]+arr[1];
	}
	else if(arr.length==1)
	{
		return arr[0];
	}
	else
		
		return 0;

	}	
		public static void main(String[] args) {
		ClassEx obj =new ClassEx();
		int num[]= {10,20,30,40};
		int result=obj.meth3(num);
		System.out.println("sum of first two element is ===> "+result);
		
	}

}
