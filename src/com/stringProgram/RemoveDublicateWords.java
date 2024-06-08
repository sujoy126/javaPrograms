package com.stringProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicateWords {
	public static void main(String[] args) {
		String str = "My name is knan";
		StringBuilder sb = new StringBuilder();
		Set<Character> st = new LinkedHashSet<>();
		for(int i=0; i<str.length(); i++) {
			st.add(str.charAt(i));
		}
		for(Character c: st) {
			sb.append(c);
		}
		System.out.println(sb);
		
	}

}
