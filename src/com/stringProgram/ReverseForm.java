package com.stringProgram;

//1. Accept a name and print it in reverse form. (If name is AMIT, then output is TIMA)

public class ReverseForm {
	public static void main(String[] args) {
		String str = "AMIT";
		for(int i=str.length()-1; i>=0; i--) {
			System.out.print(str.charAt(i));
		}
	}

}
