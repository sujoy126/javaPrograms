package com.stringProgram;

public class PelendromeString {
	public static void main(String[] args) {
		String str = "anna";
		String reverse = "";
		for(int i=str.length()-1; i>=0; i--) {
			reverse = reverse+ str.charAt(i);
		}
		if(str.equals(reverse)) {  //str.compareTo(reverse)==0
			System.out.println(str+ " is a pelendrome");
		}
		else
			System.out.println(str+ " is not a pelendrome");
	}

}
