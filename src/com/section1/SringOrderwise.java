package com.section1;

public class SringOrderwise {
	public static void main(String[] args) {
		String st = "A@!24UE*";
		StringBuilder alphabets = new StringBuilder();
		StringBuilder numbers = new StringBuilder();
		StringBuilder specialCharactor = new StringBuilder();
		
		for(char ch : st.toCharArray()) {
			
			if(Character.isAlphabetic(ch)) {
				 alphabets.append(ch);
			}
			else if(Character.isDigit(ch)) {
				 numbers.append(ch);
			}
			else
				 specialCharactor.append(ch);
		}
		
		  String s = alphabets.toString() + numbers.toString() + specialCharactor.toString();
		  System.out.println(s);
	}
}
