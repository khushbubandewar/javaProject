package kisanclassesLearning;
//Given 2 arrays of ints,a and b, return true if they have
//the same first element or they have the same last element array will be length 1 or more.
public class Class4 {
	public boolean commonEnd(int[] a,int[] b)
	{
		if(a[0]==b[0]||a[a.length-1]==b[b.length-1])
	{
		return true;
	}
	else
		return false;
}
	public static void main(String[] args) {
		Class4 obj = new Class4();
		int arr1[]= {10,20,300};
		int arr2[]= {30,60,30};
		boolean result = obj.commonEnd(arr1, arr2);
		System.out.println(result);
	}

}
