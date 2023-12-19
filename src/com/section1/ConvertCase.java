package com.section1;

import java.util.Scanner;

public class ConvertCase {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a string: ");
	String str = sc.nextLine();
	String s="";
	
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(Character.isUpperCase(ch)==true)
		{
			ch=Character.toLowerCase(ch);
			s=s+ch;
		}
		else
		{
			ch=Character.toUpperCase(ch);
			s=s+ch;	
		}
	}
	System.out.println("Original string: "+str);
	System.out.println("New String: "+s);
}
}
