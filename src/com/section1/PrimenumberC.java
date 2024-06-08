package com.section1;

public class PrimenumberC {
	public static void main(String[] args) {
		int num = 11;
		
		if (num==0 || num ==1 ) {
			System.out.println(num +" is not a prime number");
		}
		else {
			int midNum = num/2;
			for(int i=2; i<=midNum; i++) {
				if(num%i==0) {
					System.out.println(num +" is nt a prime number");
					return;
				}
			}	
		
		
			System.out.println(num+" is a prime numer");
		
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
}
