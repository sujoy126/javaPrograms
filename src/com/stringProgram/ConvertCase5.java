package com.stringProgram;

public class ConvertCase5 {
	public static void main(String[] args) {
		String str = "AmeRicaN";
		String s = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				s=s+Character.toLowerCase(ch);
			}
			else {
				s=s+Character.toUpperCase(ch);
			}
		}
		System.out.println(s);
	}

}
