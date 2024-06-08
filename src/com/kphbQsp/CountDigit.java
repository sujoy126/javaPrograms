package com.kphbQsp;

public class CountDigit {
	public static void main(String[] args) {
		long lo = 1234567890l;
		long rem;
		int count =0;
		do
		{
			rem = lo%10;
			count = count+1;
			lo = lo/10;
			
		}
		while( lo!=0);
		System.out.println(count);
	
	}

}
