package com.stringProgram;

public class BigestStringP {
	public static void main(String[] args) {
		String str = "Burn your kinetic and make it Pr ";
		 String st[] = str.split(" ");
		String longestword ="";
		for(int i=0; i<st.length; i++) {
			if(st[i].length()> longestword.length()) {
				longestword = st[i];
			}
		}
		System.out.println(longestword);
	}

}
