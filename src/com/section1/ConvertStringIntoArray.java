package com.section1;

public class ConvertStringIntoArray {
	public static void main(String[] args) {
		String st = "Automationtesting";
		String s[] = st.split("");
		for(String i: s) {
			System.out.println(i);
		}
		
	}

}
