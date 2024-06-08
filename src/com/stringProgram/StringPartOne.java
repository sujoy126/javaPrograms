package com.stringProgram;

public class StringPartOne {
	public static void main(String[] args) {
		String s = "Vamshi Banda";
		int lastindex = s.lastIndexOf(' ');
		String s1 = s.substring(0, lastindex);
		String s2 = s.substring(lastindex);
		System.out.print(s1);
		System.out.println(s2);
		String rev = "";
		for(int i = s1.length()-1;i>=0;i--) {
			rev = rev +  s1.charAt(i);
		}
		System.out.println(rev + s2);
	}

}
