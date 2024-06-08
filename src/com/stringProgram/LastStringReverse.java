package com.stringProgram;

public class LastStringReverse {
	public static void main(String[] args) {
		String str = "burn your potential";
		String st[] = str.split(" ");
		String st1 = st[0];
		String st2 = st[1];
		String st3 = st[2];
		String s="";
		
		for(int i=st3.length()-1; i>=0; i--) {
			s= s+st[2].charAt(i);
		}
		System.out.println(st1+" "+st2+" "+s );
	}

}
