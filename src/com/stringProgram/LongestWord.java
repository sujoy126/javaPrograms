package com.stringProgram;

public class LongestWord {
	public static void main(String[] args) {
		String str = "burn your potential and make it kinetic";
		String st[] = str.split(" ");
		String s = "";
		
		for(int i=0; i<st.length; i++) {
			
			if(st[i].length()>s.length()) {
				s= st[i];
				
			}
		}
		System.out.println(s+" "+s.length());
	}

}
