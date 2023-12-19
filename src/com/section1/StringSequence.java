package com.section1;

public class StringSequence {
	public static void main(String[] args) {
		String s="bA12$c@3*";
		StringBuilder alphabets = new StringBuilder();
		StringBuilder numners = new StringBuilder();
		StringBuilder specialCharactors = new StringBuilder();
		for(char c : s.toCharArray()) {
			if(Character.isAlphabetic(c)) {
				alphabets.append(c);
		
			}
			else if(Character.isDigit(c)) {
				numners.append(c);
				
			}
			else
				specialCharactors.append(c);
			   
		}
		String st = alphabets.toString()+ numners.toString()+ specialCharactors.toString();
		System.out.println(st);
		System.out.println(alphabets);
		System.out.println(numners);
		System.out.println(specialCharactors);
	}

}
