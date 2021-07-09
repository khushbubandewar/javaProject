package kisanclassesLearning;

public class InheritanceClassB extends InheritenceClassA {
	public void meth1()
	{
		System.out.println("Class B method called");
	}
	public static void main(String[] args) {
		InheritenceClassA obj = new InheritenceClassA();  //Has-A RelationShip(Runtime binding)
		obj.display();
		System.out.println("************************");
		
		InheritanceClassB obj1 = new InheritanceClassB();
		obj1.meth1();
		obj1.display(); //Is-a relationship(compile time binding)
		
	}

}
