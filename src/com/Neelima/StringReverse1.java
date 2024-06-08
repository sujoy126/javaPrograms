package com.Neelima;

public class StringReverse1 {
public static void main(String[] args) {
	String str= "Core Java";
	 String s[]=str.split(" ");
	 String s1 = s[0];
	 String s2 = s[1];
	 String sr = "";
	 for(int i = s2.length()-1;i>=0;i--)
	 {
		 
		 sr = sr + s2.charAt(i);
	 }
	 System.out.println(s1+" "+sr);
	
}
}
