package com.stringProgram;


import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicate {
	public static void main(String[] args) {
		String str = "jjjjooobbbbbbb";
		StringBuffer sf = new StringBuffer();
		Set<Character> se = new LinkedHashSet<>();
		
		  for(int i=0; i<str.length(); i++) {
			   se.add(str.charAt(i));    
		  }
		  for(Character c : se) {
			  sf.append(c);
		  }
		  System.out.println(sf);
		  
	}

}
