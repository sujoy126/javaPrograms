package com.stringProgram;

public class FindLargestWord {
	public static void main(String[] args) {
		String str = "Burn your kinetic and convert into protential";
		String st[] =str.split(" ");
		String b ="";
		int count =0;
		for(int i=0; i<st.length; i++) {
			if(st[i].length() > b.length()){
				b =  st[i]; 
				
			}
		}
		System.out.println(b+" --- is the Largest word ");
		
	}

}
