package com.stringProgram;

public class StringReversseFirstPart {
	public static void main(String[] args) {
		String str = "lenovo apple";
		String  st[] = str.split(" ");
		String firstString = st[0];
		String secondString = st[1];
		String s1  = "";
		String s2 = "";
		for(int i=firstString.length()-1; i>=0; i--) {
			s1= s1+firstString.charAt(i);
		}
		for(int i=secondString.length()-1; i>=0; i--) {
			s2= s2+secondString.charAt(i);
		}
		System.out.println(s1+ " "+s2);
	}

}
