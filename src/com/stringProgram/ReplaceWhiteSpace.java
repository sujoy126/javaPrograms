package com.stringProgram;

public class ReplaceWhiteSpace {
	public static void main(String[] args) {
	String str = "  E n  g l   i s   h    ";
	String st = str.replaceAll("\\s", ""); // unique code value "\\s" it will remove all the spaces.
	System.out.println(st);
	
	}

}
