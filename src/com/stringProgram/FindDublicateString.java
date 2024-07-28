package com.stringProgram;

import java.util.HashSet;

public class FindDublicateString {
	public static void main(String[] args) {
		String str = "It is new . It can make new";
		String words[] = str.split(" ");
		
		HashSet<String> uniqe = new HashSet<>();
		for(String word : words) {
			if(!uniqe.add(word)) {
				System.out.println(word);
			}
		}
	}

}
