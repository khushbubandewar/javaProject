package praticals;

 class Base2 {}
class Sub extends Base2 {}
class Sub2 extends Base2 {}
public class CEx{
public static void main(String argv[]){
Base2 b=new Base2();
Sub s=(Sub) b;
}
}