package com.section1;

public class PrintAlphabets {
	public static void main(String[] args) {
		String str = "AmarDesh12344";
		int la = str.length();
		for(int i=0; i<la; i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z' || ch>='a' && ch<='z' ) {
				System.out.println(ch);
			}
		
			else
			{
				System.out.println("Numbers are "+ch);
			}
		}
	}

}
