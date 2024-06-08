package com.section1;

public class SingleCharactirAccourance {
	public static void main(String[] args) {
		String str = "glass";
		char ch[] = str.toCharArray();
		
		int count =0;
		for(char c : ch) {
			if(c=='s') {
				count++;
			}
		}
		System.out.println("s"+ " of accourance "+ count);
	}

}
