package kisanclassesLearning;
//Return an int array length 3 containing the first 3 digits of pi{3,1,4}
//makepi()?[3,1,4]
public class Class3 {
	public int[] makePi()
	{
		int arr[]= {3,1,4};
		return arr;
	}
	public static void main(String[] args) {
		Class3 obj = new Class3();
		int arr[]=obj.makePi();
		for(int x:arr)
		{
			System.out.print(x);
		}
	}

}
