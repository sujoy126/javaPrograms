package com.stringProgram;

public class FetchAlpNumSpChar {
	public static void main(String[] args) {
		String str = "ONly124@%9!@#$%^&";
		String alp ="";
		String num = "";
		String spChar ="";
		for(int i=0; i<str.length(); i++) {
			char ch =str.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' ||ch=='I' || ch=='O' || ch=='U') {
				alp = alp + ch;
			}
			 if(ch>='0' && ch<='9') {
				num = num +ch;
			}
			else
				spChar = spChar+ch;
		}
		System.out.println(alp+" "+num +" "+ spChar);
	}

}
