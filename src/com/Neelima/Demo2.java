package com.Neelima;
 class A
{
	public void m1() {
		System.out.println("m1");
	}
}
class B extends A
{
	public void m2() {		
	int a = 2;
	System.out.println(a);
	}
}
class C extends A
{
	public void m3() {		
	int a = 5;
	System.out.println(a);
	System.out.println("m3");
	}
}
public class Demo2 extends A{
	public static void main(String[] args) {
		System.out.println("main");
	Demo2 d2 = new Demo2();
	d2.m1();
	B b = new B();
	b.m1();
	b.m2();
	C c = new C();
	c.m1();
	c.m3();
	
	}		
	}

