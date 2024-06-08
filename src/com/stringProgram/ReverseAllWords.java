package com.stringProgram;

public class ReverseAllWords {
	public static void main(String[] args) {
//		String str = "My name is Hari Krishna";
//		String st[] = str.split(" ");
//		for(int i=st.length-1; i>=0; i--) {
//			String p = st[i];
//			System.out.print(p+" ");
//		}
		
		String  str ="hello my name is Ram";
		String st[]= str.split(" ");
		
		for(int i = st.length-1; i>=0; i--){
			String t = st[i];
			String s ="";
		 for(int j=t.length()-1; j>=0;j--){
			char p = t.charAt(j);
			s= s+p;
		}
		 System.out.print(s+" ");
		}
		 
		
	}
}
