package com.stringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateChar {
	public static void main(String[] args) {
		String str = "caaaaaannnnnnnnnn";
		Set<Character> st = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<str.length(); i++) {
			st.add(str.charAt(i));
		}
		for(Character c: st) {
			sb.append(c);
		}
		System.out.println(sb);
	}

}
