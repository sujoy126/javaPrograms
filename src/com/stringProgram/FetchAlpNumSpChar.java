package com.stringProgram;

public class FetchAlpNumSpChar {
	public static void main(String[] args) {
		String str = "ONl124@%9!@#$%^&y";
		String alp ="";
		String num = "";
		String spChar ="";
		for(int i=0; i<str.length(); i++) {
			char ch =str.charAt(i);
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
				alp = alp + ch;
			}
			else if(ch>='0' && ch<='9') {
				num = num +ch;
			}
			
			
		}
		System.out.println(alp+" "+num +" "+ spChar);
	}

}
