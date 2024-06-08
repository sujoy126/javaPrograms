package com.stringProgram;

public class StringAccourance2 {
	public static void main(String[] args) {
		String str = "estabisment";
		 char ch[] =str.toCharArray();
		int count=0;
		 for(char c: ch) {
			 if(c=='e') {
				 count++;
			 }
		 }
		 System.out.println("e "+": "+count);
		
		
	}
	

}
