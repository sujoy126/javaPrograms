package com.section1;

public class ReverseStringAP1 {
	public static void main(String[] args) {
		String str = "hello";
		
		// Approach--1
		char ch[] = str.toCharArray();
		for(int i=ch.length-1; i>=0; i--) {
			System.out.print(ch[i]);
		}
		System.out.println();
		
		//Approach--2
		char ch2[] = str.toCharArray();
		for(int i= ch2.length-1; i>=0; i--) {
			 char ca = str.charAt(i);
			 System.out.print(ca);
		}
		
		System.out.println();
		
		//Approach--3
		 String st = "";
		 for(int i=str.length()-1; i>=0; i--) {
			 st = st+ str.charAt(i);	 
		 }
		 System.out.println(st);
		 
		 System.out.println();
		 
		//Approach--4
		 StringBuffer sf = new StringBuffer(str);
		  StringBuffer sbf = sf.reverse();
		  System.out.println(sbf);
		  
		//Approach--5
		  StringBuilder sb = new StringBuilder(str);
		  System.out.println(sb.reverse());
	}

}
