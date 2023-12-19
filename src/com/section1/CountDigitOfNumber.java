package com.section1;

// Write a program to count a digit of number.

public class CountDigitOfNumber {
	public static void main(String[] args) {
		int num = 23456789;
    	int digit;
		int  count=0;
		do
		{
			digit=num%10;
			count++;
			num=num/10;		
		}
		while(num!=0);
		System.out.println("Total number of digit : "+count);
	}

}
