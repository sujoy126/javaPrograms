package com.stringProgram;

public class AccouranceString {
	public static void main(String[] args) {
		String str = "elephent";
		
	//	char ch[] = str.toCharArray();
		
		for(int i=0; i<str.length();i++) {
			int count =0;
	      char ch1 = str.charAt(i);
			for(int j=0; j<str.length(); j++) {
				char ch2 = str.charAt(j);
				if(ch1==ch2 && i>j) {
					break;
				}
				 if(ch1==ch2) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch1+" occourance "+ count);
			}
			
			
		}
		
	}

	}
