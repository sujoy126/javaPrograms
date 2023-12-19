package com.stringProgram;


public class Reversefirstone {
	public static void main(String[] args) {
		String str ="core java";
		int lastinx = str.lastIndexOf(" ");
		String st1 = str.substring(0, lastinx);
		String st2 = str.substring(lastinx);
		String s= "";
		for(int i= st1.length()-1; i>=0;  i--) {
			s= s+st1.charAt(i);
		}
		System.out.println(s+ st2);
	
	}

}
