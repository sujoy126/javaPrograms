package com.kphbQsp;

public class PalendromNumber {
	public static void main(String[] args) {
		int num=121;
		int rem;
		int rev=0;
		int secNum =num;
		
		do {
			rem = num%10;
			rev = (rev*10)+ rem;
			num= num/10;
		}
		while(num!=0);
		if(secNum==rev) {
			System.out.println(secNum +" is palendrom number");
		}
		else
			System.out.println(secNum+" is not a palendrom number");
		
	}

}
