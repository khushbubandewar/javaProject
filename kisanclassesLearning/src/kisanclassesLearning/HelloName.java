package kisanclassesLearning;
//Given a String name eg "Bob", return a greeting in the form "Hello Bob!"
public class HelloName {
	public String helloName(String name)
	{
		return "hello "+name+" !";
	}

	public static void main(String[] args) {
		String result = new HelloName().helloName("Khushbu");
		System.out.println(result);
	}

}
