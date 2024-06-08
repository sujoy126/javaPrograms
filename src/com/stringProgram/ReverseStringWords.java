package com.stringProgram;

public class ReverseStringWords {
	public static void main(String[] args) {
		String str ="COMPUTER IS FUN";
	    String st[] = str.split(" ");
	    String reverse = "";
	   for(int i=st.length-1; i>=0; i--){
	     reverse = reverse+ st[i]+" ";
	}
	   System.out.println(reverse);
	}

}
