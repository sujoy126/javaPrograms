package com.stringProgram;

public class SingleStringAccourance {
	public static void main(String[] args) {
		String str = "Automation";
		int count=0;
		for(Character c: str.toCharArray()) {
			if(c=='o') {
			 count++;
			}	
		}
		System.out.println("o "+" is accourance "+ count);
		
	}

}
