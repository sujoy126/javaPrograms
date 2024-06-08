package com.stringProgram;

public class ReverseSecondString2 {
	public static void main(String[] args) {
		String str = "feature file";
		String st[] = str.split(" ");
		String st1 = st[0];
		String st2 = st[1];
		String s = "";
		for(int i=st2.length()-1; i>=0; i--) {
			s = s+ st2.charAt(i);
		}
		System.out.println(st1+ " "+s); 
	}

}
