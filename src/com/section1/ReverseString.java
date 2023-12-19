package com.section1;

public class ReverseString {
	public static void main(String[] args) {
		String st = "sujoy";
		String s ="";
		for(int i= st.length()-1; i>=0; i--) {
			 s= s+st.charAt(i);
		}
		System.out.println(s);
		
	// another way	
		String sp = "akash";
		String p = "";
		char ch[] = sp.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			p=p+ch[i];
		}
		System.out.println(p);
		
	}
}
