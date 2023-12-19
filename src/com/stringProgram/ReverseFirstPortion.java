package com.stringProgram;

public class ReverseFirstPortion {
	public static void main(String[] args) {
		String str = "home page";
	//	int devideIndex = str.lastIndexOf(' ');
		String st1 = str.substring(0, 4);
		String st2 = str.substring(4);
		String s = "";
		for(int i=st1.length()-1; i>=0; i--) {
			s= s+ st1.charAt(i);
		}
		System.out.println(s+st2);
		
		
	}

}
