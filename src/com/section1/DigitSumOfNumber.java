package com.section1;

// Write a program to print the digit sum of the number

public class DigitSumOfNumber {
	public static void main(String[] args) {
		int num= -123;
		int rem;
		int sum=0;
		do
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		while(num!=0);
	    System.out.println("sum of digits is : "+sum);
    }

}
