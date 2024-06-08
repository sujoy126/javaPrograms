package com.stringProgram;

public class CountWords2 {
	public static void main(String[] args) {
		String str ="Do not break your ice";
		String st[] = str.split(" ");
		int count =0;
		for(String s : st) {
			System.out.println(s);
			count++;
		}
		System.out.println(count);
	}

}
