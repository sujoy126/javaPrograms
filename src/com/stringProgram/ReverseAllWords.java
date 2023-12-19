package com.stringProgram;

public class ReverseAllWords {
	public static void main(String[] args) {
		String str = "My name is Hari Krishna";
		String st[] = str.split(" ");
		for(int i=st.length-1; i>=0; i--) {
			String p = st[i];
			System.out.print(p+" ");
		}
		
	}
}
