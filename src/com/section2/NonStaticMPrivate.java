package com.section2;

//Within the same class we can declare methods are private or protected.

public class NonStaticMPrivate {
	protected  void m1() {
		System.out.println("This is a protected method");
	}
	
	
	private void m2() {
		m1();
		System.out.println("This not a protected method");
	}
	
	public static void main(String[] args) {
		NonStaticMPrivate nv = new NonStaticMPrivate();
		nv.m1();
		nv.m2();
	}

}
