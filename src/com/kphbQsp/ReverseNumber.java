package com.kphbQsp;

public class ReverseNumber {
	public static void main(String[] args) {
		int num=456;
		int rev =0;
		int rem;
		int secNum = num;
		do {
			rem= num%10;
			rev= rev*10+ rem;
			num= num/10;
		}
		while(num!=0);
			System.out.println("reverse of "+secNum+" is "+ rev);
		
	}

}
