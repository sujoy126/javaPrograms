package com.stringProgram;

//4. WAP in BASIC to take a proverbial statement (like 'Failure are the pillars of success') as 
//an input from the user and then output the frequency of the vowels occurring in the statement.

public class FrequentlyVowelCount {
	public static void main(String[] args) {
		String str="Failure are the pillars of success";
		int va = 0, ve=0, vi=0, vo=0, vu=0;
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(c=='A'|| c=='a') 
				va++;
			if(c=='E'|| c=='e') 
				ve++;
			if(c=='I'|| c=='i') 
				vi++;
			if(c=='O'|| c=='o') 
				vo++;
			if(c=='U'|| c=='u') 
				vu++;
		}
		System.out.println(" No of time vowel 'A' is present "+va);
		System.out.println(" No of time vowel 'E' is present "+ve);
		System.out.println(" No of time vowel 'I' is present "+vi);
		System.out.println(" No of time vowel 'O' is present "+vo);
		System.out.println(" No of time vowel 'U' is present "+vu);
		
	}

}
