package com.stringProgram;

public class ReverseWords {
	public static void main(String[] args) {
		String str ="It is the best way to devolop";
		 String[] st = str.split(" ");
		 for(int i=st.length-1; i>=0; i--) {
			   String p = st[i];
			   System.out.print(p+" ");
		}
		
		
	}

}
