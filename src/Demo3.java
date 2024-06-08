abstract class A
{
	public abstract void m1();
}
class B extends A
{
	@Override
	public void m1()
	{
		System.out.println("m1");
	}
	public void m2() {
		System.out.println("m2");
	}
}
public class Demo3 {	
public static void main(String[] args) {
	B b = new B();
	b.m1();
	b.m2();
}
}
