package com.section1;

public class SpyNumber_digitSum_Product {
	public static void main(String[] args) {
		int num= 22;
		int rem;
		int sum=0;
		int sndnum = num;
		int origin= num;
		int prod=1;
		do
		{
			rem = num%10;
			sum = sum+rem;
			num = num/10;
		}
		while(num!=0);
		
			do
			{
				rem = sndnum%10;
				prod= prod*rem;
				sndnum = sndnum/10;
			}
			while(sndnum!=0);
			
			if(sum==prod)
			
				System.out.println(origin +" is spy number becouse product and sum of digits are same.");
			
			else
			
				System.out.println(origin+" is not a spy number");
			
	}

}
