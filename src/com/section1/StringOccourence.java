package com.section1;

public class StringOccourence {
	public static void main(String[] args) {
		String str = "AutomationTesting";
		String st = str.toLowerCase();
		char ch[]= st.toCharArray();
		for(int i=0; i<ch.length; i++) {
			int count= 0;
			for(int j=0; j<ch.length; j++) {
				if(ch[i]==ch[j] && i>j) {
					break;
				}
				if(ch[i]==ch[j]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println(ch[i]+" of occourence "+count);
			}
		}
	}

}
