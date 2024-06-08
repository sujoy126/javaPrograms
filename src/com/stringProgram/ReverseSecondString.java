package com.stringProgram;

public class ReverseSecondString {
	public static void main(String[] args) {
		String str = "Indian Ocean";
		String st[] = str.split(" ");
		String st1 = st[0];
		String st2 = st[1];
		String st2Rev = "";
		for(int i=st2.length()-1; i>=0; i--) {
			st2Rev = st2Rev+ st2.charAt(i);
		}
		System.out.println(st1+" "+ st2Rev);
		
	}
	

}
