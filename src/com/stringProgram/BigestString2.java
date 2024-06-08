package com.stringProgram;

public class BigestString2 {
	public static void main(String[] args) {
		String str = "burn your protential and make it kinetic ";
		String st[] =str.split(" ");
		String s ="";
		for(int i=0; i<st.length; i++) {
			if(st[i].length()>s.length()) {
				s= st[i];
			}
		}
		System.out.println(s+ " : is the biggest string ");
		System.out.println("Length of the String is : "+ s.length());
	}

}
