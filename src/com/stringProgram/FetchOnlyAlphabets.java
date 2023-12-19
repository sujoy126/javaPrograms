package com.stringProgram;

public class FetchOnlyAlphabets {
	public static void main(String[] args) {
		String str ="GI@2R$786@!u#S*";
		char ch[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			if((ch[i]>='a' && 'z'>=ch[i])||(ch[i]>='A' && ch[i]<='z')) {
				System.out.print(ch[i]);
			}
		}
		
	}

}
