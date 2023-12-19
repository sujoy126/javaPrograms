package com.section1;

public class Sum_of_Even_Places_number {
	public static void main(String[] args) {
		int num = 999999;
		int rem;
		int sum=0;
		do
		{
			rem = num%10;
			if(rem%2==0)
	     	{
			sum= sum+rem;
		    }
		    num= num/10;
		}
		while(num!=0);
		System.out.println(sum+" even place");
		
	}
	
	

}
