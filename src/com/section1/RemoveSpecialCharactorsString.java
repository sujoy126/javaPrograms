package com.section1;

public class RemoveSpecialCharactorsString {
	public static void main(String[] args) {
		String str = "In@#d!04@#i$@a";
		
		// Approach--1
		
		String sp = str.replaceAll("[^a-zA-Z]", "");
		System.out.println(sp);
		
		
	}

}
