package com.stringProgram;

public class ReverseFirstPart {
	public static void main(String[] args) {
		String str = "Hari Krishna";
		int ch = str.lastIndexOf(' ');
		String st1 = str.substring(0, ch);
		String st2 = str.substring(ch);
		String s = "";
		for(int i=st1.length()-1; i>=0; i--) {
			s = s+st1.charAt(i);
		}
		System.out.println(s+ st2);
	}

}
