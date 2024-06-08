package com.kphbQsp;

import java.util.Arrays;

public class AnagramStrings {
	public static void main(String[] args) {
		String st1 ="top";
		String st2 = "pot";
		char ch1[] =st1.toCharArray();
		char ch2[] = st2.toCharArray();
		 Arrays.sort(ch1);
		 Arrays.sort(ch2);
		 
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("An");
		}
		else
			System.out.println("not An");
		
	}

}
