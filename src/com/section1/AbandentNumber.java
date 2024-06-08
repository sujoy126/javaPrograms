package com.section1;

public class AbandentNumber {
	public static void main(String[] args) {
		// 12 = 1+2+3+4+6;
		//16>12;
		
		int num =8;
		 int sum=0; 
		for(int i=1; i<num; i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		if(sum>num) {
			System.out.println(num+" is an abandent Number");
		}
		else
			System.out.println(num+" is not a abandent Number");
	}

}
