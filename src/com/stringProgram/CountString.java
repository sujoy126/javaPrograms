package com.stringProgram;

public class CountString {
	public static void main(String[] args) {
		String str = "a  b c  d e f";
		int count=0;
		String st[] =str.split(" ");
		for(String s: st) {
			count++;
		}
		System.out.println(count);
	}

}
