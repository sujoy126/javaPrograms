package com.stringProgram;

public class ReverseLastWord {
	public static void main(String[] args) {
		String str = "save the earth";
		String st[] = str.split(" ");
		String st1= st[0]; 
		String st2= st[1]; 
		String st3= st[2]; 
		String s ="";
		for(int i=st3.length()-1 ; i>=0; i--) {
			s= s+ st3.charAt(i);
		}
		System.out.println(s);
	}

}
