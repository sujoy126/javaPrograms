package com.section1;

public class Prime {

	public  static void p(int num)
	{
		int c=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		
		}
		if(c==0)
		{
			System.out.println(num);
		}
	}
	
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int num=i;
			p(num);
		}
		
		
	}
}
