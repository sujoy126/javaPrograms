package com.stringProgram;

public class ReverseBothSring {
	public static void main(String[] args) {
		String str = "automation testing";
		String st[] = str.split(" ");
		String firstPart = st[0];
		String secondPart = st[1];
		String s1 = "";
		String s2 = "";
		for(int i= firstPart.length()-1; i>=0; i--) {
			s1 = s1+firstPart.charAt(i);
		}
		for(int j= secondPart.length()-1; j>=0; j--) {
			s2 = s2+ secondPart.charAt(j);
		}
		System.out.println(s1+ " "+ s2);
	}

}
