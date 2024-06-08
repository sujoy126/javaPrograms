package com.stringProgram;

public class SnigleLetterAccourance {
	public static void main(String[] args) {
		String str ="engineering";
		char[] ch = str.toCharArray();
		int count=0;
		for(char c: ch) {
			
			if(c=='e') {
				count++;
			}
		}
		System.out.println("e"+" is preset for "+count+" times");
	}

}
