package com.section1;

import java.util.Scanner;

// Write a program to check whether the number is perfect or not.
// 6 is divisible by which number you add  all that number except 6 and check 
// there sum is equal to 6 if it is same then it become a Armstrong number

public class PerfectNumberOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pass the integer num :");
		int num = sc.nextInt();
		isPerfectNum(num);
	}
	public static void isPerfectNum(int num)
	{
		
		int sum= 0;
		for(int i=1; i<num; i++)
		{
		  if(num%i==0)
		  {
			sum = i+sum;
		  }
		}
		if(sum==num)
			System.out.println(num+" is a perfect number.");
		else 
			System.out.println(num+" is not a perfect number.");
	}

}
