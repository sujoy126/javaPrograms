package com.stringProgram;

public class ConvertCase3 {
	public static void main(String[] args) {
		String str="AUtoMaTiOn";
		String s ="";
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(Character.isUpperCase(ch)) {
				s = s+Character.toLowerCase(ch);
			}
			else {
			 s= s+ Character.toUpperCase(ch);
			
			}
		}
		System.out.println(s);
	}

}
