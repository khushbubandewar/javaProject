package kisanclassesLearning;
//Given an array of int,return true if the array is length 1 or more ,
//and the first element and the last element are equal.
public class Class2 {
	public boolean sameFirstLast(int[] nums)
	{
		if(nums.length>=1&&nums[0]==nums[nums.length-1])
		{
			return true;
		}
		else
			return false;
	}
	public static void main(String[] args) {
		Class2 obj = new Class2();
		int arr[]= {10,20,30,10};
		boolean result = obj.sameFirstLast(arr);
		System.out.println(result);
	}

}
