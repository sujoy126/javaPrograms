package com.section1;

// Write a program to print the digital product of number.

public class DigitProductofNumber {
	public static void main(String[] args) {
		int num = 1234;
		int rem;
		int product=1;
		do
		{
			rem= num%10;
			product = rem*product;
			num = num/10;
		}
		while(num!=0);
		System.out.println("product of number is : "+product);
	}

}
