package com.stringProgram;

public class FetchALphabetsAndNumbersSeperatly {
	public static void main(String[] args) {
		String str = "A1b2$!C3%D4@#";
		String alphabets = "";
		String numbers = "";
		String spCharactors ="";
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if((ch[i]>='a' && ch[i]<='z') ||(ch[i]>='A' && ch[i]<='z')){	
				alphabets = alphabets+ str.charAt(i);	
			}	
			else if(ch[i]>='0' && ch[i]<='9') {
				numbers = numbers+ str.charAt(i);
			}
			else
				spCharactors = spCharactors+ str.charAt(i);
		}
		System.out.println(alphabets);
		System.out.println(numbers);
		System.out.println(spCharactors);
		
		
		

	
	}

}
