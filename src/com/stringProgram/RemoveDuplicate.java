package com.stringProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
	public static void main(String[] args) {
		String st = "progggggggramming";
		
		// Approach--1
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<st.length(); i++) {
			char ch = st.charAt(i);
			int p = st.indexOf(ch, i+1);
			if(p == -1) {
			sb.append(ch);
		}		
		}
		System.out.println(sb);
		
		// Approach--2
		StringBuilder sb2 = new StringBuilder();
		Set<Character> ch = new LinkedHashSet<>();
		for(int i=0; i<st.length(); i++) {
			 ch.add(st.charAt(i));
		}
		for(Character c : ch) {
			sb2.append(c);
		}
		System.out.println(sb2);
		
		//Approach--3
		
		char ch3[] = st.toCharArray();
		StringBuilder sb3 = new StringBuilder();
		for(int i=0; i<ch3.length; i++) {
			boolean repeted = false; 
			for(int j=i+1; j<ch3.length; j++) {
				if(ch3[i] == ch3[j]) {
					repeted = true;
					break;
				}
			}
			if(!repeted) {
				sb3.append(ch3[i]);
			}
		}
		System.out.println(sb3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
