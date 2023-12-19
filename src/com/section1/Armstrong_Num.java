package com.section1;

import java.util.Scanner;

// Write a program for Armstrong number
// 123 = 1^3+2^3+3^3 =123

public class Armstrong_Num {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter integer type number :");
		int num= sc.nextInt(); 
		isArmstrong( num);
	}
	public static void isArmstrong(int num)
	{
		int rem;
		int count= 0;
		int secnum= num;
		int realnum= secnum;
		double sum=0;
		do
		{
			rem = num%10;
			count++;
			num = num/10;
		}
		while(num!=0);
		
		do
		{
			rem = secnum%10;
			sum+=  Math.pow(rem, count);
			secnum = secnum/10;
		}
		while(secnum!=0);
		
		if(realnum==secnum)
		{
			System.out.println( realnum+" is a Armstrong number ");
		}
		else
		{
			System.out.println(realnum+" is not a Armstrong number");
		}
		
	}
		
	}


