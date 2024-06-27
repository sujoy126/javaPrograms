package com.stringProgram;

public class CountWord3 {
	public static void main(String[] args) {
		
	String str = "last month students";
	String st[] = str.split(" ");
	int count = 0;
	for(String s: st) {
		count++;
	}
	System.out.println(count);
	}
}
