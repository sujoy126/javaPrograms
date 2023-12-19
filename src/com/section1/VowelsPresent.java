package com.section1;

//WAP print vowels present in given string

public class VowelsPresent {
	public static void main(String[] args) {
		String str = "AutomationTesting";
		char[] ch = str.toCharArray();
		int ln = ch.length;
		for(int i=0; i<ln; i++) {
		//	char ch = str.charAt(i);
			
		    if(ch[i]=='a'|| ch[i]=='e'||ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u'|| ch[i]=='A'|| ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U') {
		    	System.out.println(ch[i]);
		    }
		}
	}

}
