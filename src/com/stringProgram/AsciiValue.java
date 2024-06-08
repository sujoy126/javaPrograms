package com.stringProgram;


//2. WAP to accept a name. Then display the ASCII value of each character present in that name.

public class AsciiValue {
	public static void main(String[] args) {
		String str = "AMITABH";
		 char ch[] =str.toCharArray();
		 for(char c :ch) {
			 int a =c;
			 System.out.println( c + " ascii value "+ a);
		 }
	}

}
