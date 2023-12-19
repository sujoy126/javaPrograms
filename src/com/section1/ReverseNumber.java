package com.section1;

// Write a program to print every digit of a  given number is reversed. 

public class ReverseNumber {
	public static void main(String[] args) {
		int num= 987654321;
		int reminder;
		int rev=0;
		int  origin=num;
		do
		{
			reminder =num%10;
			rev = (rev*10)+reminder;
			num = num/10;
		}
		while(num!=0);
		System.out.println(origin+" : of Reverse number is : "+ rev);		
	}

}
