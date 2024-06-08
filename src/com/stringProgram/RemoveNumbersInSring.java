package com.stringProgram;

public class RemoveNumbersInSring {
	public static void main(String[] args) {
		String s = "Ab2hishek23";
		String s2 = "";
		char ch[] = s.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if((ch[i]>='a' && ch[i]<='z')||(ch[i]>='A' && ch[i]<='Z')) {
				s2 = s2+ s.charAt(i);
			}	
		}
		System.out.println(s2);
		
	}

}
