package com.stringProgram;

public class BigestWord {
	public static void main(String[] args) {
		String str = "Placed as a software test Engineering";
		String word[] = str.split(" ");
		String LargestWord ="";
		for(int i=0; i<word.length; i++) {
			if(word[i].length()> LargestWord.length()) {
				LargestWord = word[i];
				}
		}
		System.out.println("Largest worg is : "+ LargestWord);
		System.out.println("Size of largest Word : "+ LargestWord.length());
	}

}
