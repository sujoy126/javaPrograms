package com.stringProgram;

public class BigestString {
	public static void main(String[] args) {
		/*
		 * String str = "TATA FOOTBALL ACADEMY WILL PLAY AGAINST MOHAN BAGAN ";
		 * 
		 * String st[] = str.split(" "); String longWord =""; for(int i=0; i<st.length;
		 * i++) { for(int j=i+1; i<st.length; j++) { if(st[i].length()>= st[j].length()
		 * ) { longWord = st[i]; }
		 * 
		 * 
		 * System.out.println(longWord+
		 * " is the longest word with "+longWord.length()+" charactors. "); } }
		 */
		
		String str = "Today is the happiest day in my life";
		String word[] = str.split(" ");
		String longestWord = "";
		for(int i=0; i<word.length; i++) {
			if(word[i].length()> longestWord.length()) {
				longestWord= word[i]; 
			}
				
		}
		System.out.println(longestWord);
		System.out.println(longestWord.length());
		
		
	}

}
