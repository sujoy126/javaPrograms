package com.section1;


public class ShtingAString {
	public static void main(String[] args) {
		String str ="Dnyaneshwar";
		
		char ch[] = str.toCharArray();
		System.out.println(ch);
		//char c = str.charAt(2);
	//	System.out.println(c);
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j< str.length(); j++) {
				 if(ch[i]>ch[j]) {
					 char temp = ch[i];
					 ch[i]= ch[j];
					 ch[j]= temp;
				 }
				 
				 
		}
			
		}
		System.out.println(ch);
	}
}
		
		
		
		
		
		
		
		
		
		
		


