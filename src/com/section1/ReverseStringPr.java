package com.section1;

public class ReverseStringPr {
	public static void main(String[] args) {
		String st = "TIGER lion";
		String ss =" ";
		char cp;
		for(int i=st.length()-1; i>=0; i--) {
			 cp = st.charAt(i);
			 ss = ss+cp;
		}
			System.out.println(ss);
			
	}

}
