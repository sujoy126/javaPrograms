package com.section1;



public class VowelsString {
	public static void main(String[] args) {
		String str = "sujoymondal";
		char ch[] = str.toCharArray();
		
	
		for(int i=0; i<ch.length; i++) {
			if(ch[i]== 'A' || ch[i]== 'E' || ch[i]== 'I' || ch[i]== 'O' || ch[i]== 'U' || ch[i]== 'a' || ch[i]== 'e' || ch[i]== 'i' || ch[i]== 'o' || ch[i]== 'u') {
				System.out.println(ch[i] );
			}
		
			
		}
	}

}
