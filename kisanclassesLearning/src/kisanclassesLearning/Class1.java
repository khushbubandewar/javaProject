package kisanclassesLearning;
//Given an array of ints ,return true if 6 appears as either the first or 
//last element in the array.
//the array will be length1 or more.
public class Class1 {
	public boolean firstLast6(int[] nums)
	{
		if(nums[0]==6||nums[nums.length-1]==6)
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		Class1 obj = new Class1();
		int arr[]= {10,20,30,40};
		boolean result=obj.firstLast6(arr);
		System.out.println(result);
	}

}
