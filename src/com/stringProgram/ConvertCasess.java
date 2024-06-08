package com.stringProgram;

public class ConvertCasess {
	public static void main(String[] args) {
		String str = "GolCoNDa";
	
		String s ="";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				s= s+ Character.toLowerCase(ch);
				
			}
			else {
				 ch = Character.toUpperCase(ch);
			s= s+ch;
			}
			
			}
		System.out.println(s);

		}
	

}
