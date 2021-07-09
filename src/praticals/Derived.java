package praticals;

class Base1
{int i = 99;
public void amethod()
{
System.out.println("Base.amethod()");
}
Base1(){
amethod();
}
}
public class Derived extends Base1
{
int i = -1;
public static void main(String argv[])
{
Base1 b = new Derived();
System.out.println(b.i);
b.amethod();
}
public void amethod()
{
System.out.println("Derived.amethod()");
}
}