package com.stringProgram;

public class StringReverseSecondPart {
	public static void main(String[] args) {
		String str= "note book";
		String st[] = str.split(" ");
		 String firstString = st[0];
		 String secondString = st[1];
		 String s= "";
		 for(int i=secondString.length()-1; i>=0; i--) {
			 s= s+ secondString.charAt(i);
		 }
		 System.out.println(firstString+" "+ s);
		
	}

}
