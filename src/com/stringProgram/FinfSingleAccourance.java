package com.stringProgram;

public class FinfSingleAccourance {
	public static void main(String[] args) {
		String str = "automation testing";
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
				if(ch=='g') {
					count++;
				}
				
			}
		System.out.println("g is there for: "+count);
	}

}
