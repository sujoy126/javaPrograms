package com.stringProgram;

public class LargestWord {
	public static void main(String[] args) {
		String str = "Burn your kinetic and convert into protential";
		String st[]= str.split(" ");
		String s= "";
		for(int i=0; i<st.length; i++) {
			if(st[i].length()> s.length()) {
				s= st[i];
			}
		}
		System.out.println(s);
	}

}
