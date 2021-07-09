package kisanclassesLearning;

public class StringHandling 
{
	public void display() {
		String s1="JavA";
		System.out.println(s1.concat(" is awesome"));
		System.out.println("After Concatination=====>"+s1);
		
		String s2=new String("Java");
		System.out.println("*****Comparing two String s1 and s2******");
		System.out.println(".equals()===>"+s1.equals(s2));
		System.out.println("Ignoring case Sensitiveness=====>"+s1.equalsIgnoreCase(s2));
		
		System.out.println("Acquaring the length of s2=====>"+s2.length());
		String s3="Java is awesome";
		System.out.println("Acquaring the length of s3=====>"+s3.length());
		
		char c=s1.charAt(2);
		System.out.println("charAt()=====>"+c);
		
		System.out.println("startwith()=====>"+s1.startsWith("Java"));
		
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());
		
		String sub=s3.substring(8);
		System.out.println("subString()=====>"+sub);
		String sub2=s3.substring(5,7);
		System.out.println("subString()=====>"+sub2);
		
		String s4="jovo";
		System.out.println(s4.replace('o', 'a'));
		
		String s5="India";
		System.out.println("s5 Length=====>"+s5.length());
		System.out.println("trim()=====>"+s5.trim().length());
		
		System.out.println(s2.indexOf('a'));
		System.out.println(s2.lastIndexOf('a'));
	
		
	}

	public static void main(String[] args)
	{
		StringHandling obj1=new StringHandling();
		StringHandling obj2=new StringHandling();
		obj1.display();
		System.out.println("***********************************************");
		System.out.println("Comparing two Objects===>"+obj1.equals(obj2));
		
	}

}
