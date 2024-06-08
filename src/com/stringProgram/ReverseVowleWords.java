package com.stringProgram;

public class ReverseVowleWords {
	public static void main(String[] args) {
		String str = "burn your potential image and make it kinetic";
		String st[] = str.split(" ");
		String s = "";
		for(int i=0; i<st.length; i++) {
			char ch = st[i].charAt(0);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'|| ch=='U') {
				for(int j= st[i].length()-1; j>=0; j--) {
					s= s+ st[i].charAt(j);	
				}
				System.out.println(s);
				  s="";
			}
			

		}
				
	}

}
