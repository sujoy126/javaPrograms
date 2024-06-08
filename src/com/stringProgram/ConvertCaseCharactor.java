package com.stringProgram;

public class ConvertCaseCharactor {
	public static void main(String[] args) {
		String str ="App is  working properly ";
		String st[] = str.split(" ");
		int count=0;
		for(String s: st) {
			count++;
		}
		System.out.println(count);
	}

}
