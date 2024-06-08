package com.stringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharactor {
	public static void main(String[] args) {
		String str = "I am a good boy";
	     int count=0;
		StringBuilder sb = new StringBuilder();
		Set<Character> se = new LinkedHashSet<>();
		for(int i=0; i<str.length(); i++) {
			se.add(str.charAt(i));
		}
		
		  for(Character c: se) { 
			  sb.append(c);
			  }
		 
		System.out.println(sb);
//		System.out.println(sb.length());
		
	}

}
