package com.stringProgram;

public class StringAccourance {
	public static void main(String[] args) {
		String str = "elephant tower";
		char ch[] = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			int count=0;
			for(int j=0; j<ch.length; j++) {
				if(ch[i]==ch[j] && i>j) {
					break;
				}
				 if(ch[i]==ch[j])
					count++;		
			}
			if(count>0)
				System.out.println(ch[i]+" of accourance are "+count);
		}
	}

}
