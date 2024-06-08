package com.section1;

public class PrimeNumber {
	public static void main(String[] args) {
		int p = 7;
		int count =0;
		for(int i=1; i<=7; i++) {
				if(p%i==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.println(p+ " is a prime number");
			}
			else
				System.out.println(p+" is not a prime number");
			
		
	}

}
