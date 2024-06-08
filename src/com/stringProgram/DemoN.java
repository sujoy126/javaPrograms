package com.stringProgram;

public class DemoN {
public static void main(String[] args) {
//	String s = "Hello";
//	char ch[] = s.toCharArray();
//	for(char i = 0;i<ch.length;i++)
//	{
//		System.out.println(ch[i]);
//	}
//	int count = 0;
//	for(int i =2;i<=5;i++)
//	{
//		int j;
//		for(j = 2;j<i;j++)	
//		{
//			if(i%j==0)
//			{				
//				break;
//			}
//	}
//	if(i==j)
//	{
//		count++;
//		System.out.println(i);
//		
//	}
//	}
//	System.out.println("total prime numbers: "+count);
	String s = "core java";
 char ch[] = s.toCharArray();
 String st = "";
 
 for(int i = ch.length-1;i>=0;i-- )
 {
	 st = st+ch[i];
 }
 System.out.println(st);
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
