package com.section1;

// write a program to check whether the number is perfect Square or not.

public class PerfectSquareOrNot {
	public static void main(String[] args) {
		int num = 12;
		double d= Math.sqrt(num);
			if(d*d==num)
			{
				System.out.println(d+" is a perfect Square root of : "+num);
			}
		
			else
		    	System.out.println(num+" is not a perfect squear number");
		}
	

}
