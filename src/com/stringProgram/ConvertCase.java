package com.stringProgram;

public class ConvertCase {
	public static void main(String[] args) {
		String str = "AppLe";
		
		String s = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			
			if(Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
				s=s+ch;
			}
			else {
				ch =Character.toUpperCase(ch);
			   s= s+ch;
			}
		}
		System.out.println(s);
	}

}
