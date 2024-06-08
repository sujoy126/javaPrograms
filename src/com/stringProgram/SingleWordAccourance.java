package com.stringProgram;

public class SingleWordAccourance {
	public static void main(String[] args) {
		String str = "accourance";
//		char cp = str.charAt(7);
//		int p = str.indexOf('r');
//		System.out.println(cp);
//		System.out.println(p);
		int count=0;
		 for(int i=0; i<str.length(); i++) {
			 char ch = str.charAt(i);
			 if(ch=='c') {
				 count++;
			 }
		 }
		 System.out.println("c"+" of accourance "+count);
	}

}
