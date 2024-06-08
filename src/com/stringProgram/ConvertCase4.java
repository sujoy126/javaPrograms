package com.stringProgram;

public class ConvertCase4 {
	public static void main(String[] args) {
		String str = "LApToP";
		String s1 = "";
		String s2="";
		int count1=0;
		int count2=0;
		for(int i=0; i<str.length(); i++) {
			char ch =str.charAt(i);
			if(Character.isUpperCase(ch)) {
				s1= s1+ch;
			  count1++;	
			}
			else {
				s2=s2+ch;
				count2++;
			}
			}
		System.out.println(s1+" : "+ count1);
		System.out.println(s2+" : " +count2);
				
	}

}
