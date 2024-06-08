package com.stringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCh {
	public static void main(String[] args) {
		String str = "naaaameeee";
		
		StringBuilder sb = new StringBuilder();
		Set<Character> s = new LinkedHashSet<>();
		for(int i=0; i<=str.length(); i++) {
			s.add(str.charAt(i));
		}
		for(Character c: s) {
			sb.append(c);
		}
		System.out.println(sb);
	}

}
