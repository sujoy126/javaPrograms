package com.stringProgram;

public class CountWords {
	public static void main(String[] args) {
		String str = "We can do it";
		String[] st = str.split(" ");
		int count=0;
		for(String s: st) {
			System.out.println(s);
			count++;
		}
		System.out.println(count);
	}

}
