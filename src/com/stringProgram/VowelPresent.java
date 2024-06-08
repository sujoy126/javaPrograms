package com.stringProgram;

//3. WAP to read a word. Print the position of the first vowel occurring in the word. 
//If there is no vowel in the word then print 'Sorry no vowel'.

public class VowelPresent {
	public static void main(String[] args) {
		String str = "MTeBHA";
		int count=0 ;
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch =='A'|| ch =='E'|| ch =='I'|| ch =='O'|| ch =='U'|| ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u') {
				count= i+1;
				break;
			}
		}
		if(count==0) {
			System.out.println("sorry no Vowel");
		}
		else
			System.out.println("Position of first vowel "+ count);
	}

}
