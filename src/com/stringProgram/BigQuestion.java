package com.stringProgram;

/*
 * 5. WAP to enter any sentence and calculate the following:
  a) Total number of digits present in it.
  b) Total number of small letters and capital letters present in it.
  c) Total number of alphabets used in it.
  d) Total number of special character used in it.
  e) Total number of vowels presents in it.
  f) Total Number words present in that sentence.

 */
public class BigQuestion {
	public static void main(String[] args) {
		String str = "0-16, Shiva Ganga Apartment, Sonari, Phone No. 3317430";
		int countDigit=0, countSmallLatter=0, countCapitalletter=0, countAlphabet=0;
		int countSpecialCharactor=0;
		  for(int i =0; i<str.length(); i++) {
			  char ch = str.charAt(i);
			 
			  if(ch>='0' && ch<='9') {
				  countDigit++;
			  }
			  
			  
			  else if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')) {
				 if(ch>='a' && ch<='z')
					 countSmallLatter++;
				 if(ch>='A' && ch<='Z')
					 countCapitalletter++;
				 countAlphabet++;
			  }
			 
		  }
		  countSpecialCharactor++;
		  
		  
		  System.out.println("Total number of digits present     : "+ countDigit);
		  System.out.println("Total number of small letters      : "+ countSmallLatter);
		  System.out.println("Total number of capital letters    : "+ countCapitalletter);
		  System.out.println("Total number of alphabets          : "+ countAlphabet);
		  System.out.println("Total number of Special charactors : "+ countSpecialCharactor);
			
	}

}
