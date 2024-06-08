package com.stringProgram;

public class PalendromeOfString {
	public static void main(String[] args) {
		String str ="anna";
		String r ="";
		for(int i=str.length()-1; i>=0; i--) {
			r = r+ str.charAt(i);
		}
		if(str.equals(r)) {
			System.out.println(str +" is pelendrome");
		}
		else
			System.out.println(str+" is not a pelendrome");
	}

}
