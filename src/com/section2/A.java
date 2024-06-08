package com.section2;

public interface A {
	public default  void mts() {
		System.out.println("This is Default complete Interface method present in A interface");
}
	public void mts2(); 
	
	public static void mts3() {
		System.out.println("This is complete static method present in A interface");
	}

}
