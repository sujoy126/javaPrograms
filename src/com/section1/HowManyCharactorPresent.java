package com.section1;

public class HowManyCharactorPresent {
	public static void main(String[] args) {
		String st = "sai";
		String[] ch = st.split("");
		int count =0;
		for(String s : ch) {
			count++;
		}
		System.out.println(count);
	}

}
