package com.stringProgram;

public class AccouranceString2 {
	public static void main(String[] args) {
		String str = "aaaaaaaaa";
		int count=0;
		char ch[] = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			for(int j=0; j<str.length(); j++) {
				
				if(ch[i]==ch[j] && i>j) {
					break;
				}
				else if(ch[i]==ch[j]) {
					count++;
				}	
			}
			if(count>0) {
				System.out.println(ch[i]+" accourance of string are "+count);
			}
		}
	}

}