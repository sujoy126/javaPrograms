package com.stringProgram;

public class SeperateString {
	public static void main(String[] args) {
		String str = "core java";
		int divideInx = str.lastIndexOf(" ");
		System.out.println(divideInx);
		String st1 = str.substring(0, divideInx);
		String st2 = str.substring(divideInx);
		String s = "";
		for(int i=st2.length()-1; i>=0; i--) {
			s = s +st2.charAt(i);
		}
		System.out.println(st1+ s);
	}

}
