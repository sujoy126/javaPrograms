package com.section1;

public class PrimeNum {
	public static int isprime(int num, int i, int c) {
		if (num % i == 0) {
		 c++;
		}
		
		if ( i==num/2) {
			return c;
			
		}
		
		i++;
		return isprime(num, i, c);
	}
	public static void main(String[] args) {
		int a=isprime(4, 2, 0);
		if (a==0) {
			System.out.println("prime");
		} 
		 else {
			System.out.println("N PRime");
		}
	}

}
