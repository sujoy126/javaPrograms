package com.section2;

public class ClassB implements A {
	@Override
	public  void mts() {
		System.out.println("mts is a Default overriden method  of A interface");
	}
	
	
	@Override
	public void mts2() {
		System.out.println("m2 method is complete is in classB");
	}
	
	
	public static void main(String[] args) {
		
		
		  ClassB b = new ClassB();
		  b.mts2();
		 
		b.mts();
		A.mts3();
		
		
		
	}
}
