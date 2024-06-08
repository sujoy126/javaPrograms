package com.Neelima;

public class Demo1 {
public static void main(String[]args)
{
	
//	   int num = 153, copy=num,original=num,digit,sum=0,count=0;
//	    do {  digit = num%10; 
//	          count++; 
//	           num=num/10; 
//	           } 
//	           while(num!=0); 
//	           do {
//	  digit=copy%10; 
//	   sum+=Math.pow(digit, count); 
//	   copy=copy/10; 
//	   } 
//	  while(copy!=0); 
//	            if(sum==original) 
//	            {  System.out.println("arm"); 
//	            }
//	   else { 
//	            System.out.println("not arm"); 
//	            }
	 
	
	
	
	   int num = 25,copy=num; 
	   int digit,reverse=0; 
	   do {
		    digit=num%10; 
	   
	  reverse = (reverse*10)+digit; 
	   num=num/10; 
	    } 
	   while(num!=0); 
	  if(reverse==copy) 
		 { 
		   System.out.println("pal"); 
		    } 
	  else { 
		 
	  System.out.println("not pal"); 
	  }
	 	
	
	/*
	 * // int num = 234; // int sum = 0; // int digit; // int pro = 1; // do { //
	 * digit = num%10; // sum = sum + digit; // pro = pro * digit; // num=num/10; //
	 * } // while(num!=0); // System.out.println("sum: "+sum); //
	 * System.out.println("pro: "+pro);
	 */	
	
	
	/*
	 * // int num = 5; // int count = 0; //
	 * System.out.println("factors of "+num+" are: "); // for(int i = 1;i<=num;i++)
	 * // { // if(num%i==0) // { // System.out.println(i); // count++; // } // } //
	 * System.out.println("no of factors are: "+count);
	 */
	
	
	/*
	 * // int num = 4; // int count = 0; // for(int i = 1;i<=num;i++) // { //
	 * if(num%i==0) // { // count++; // } // } // if(count==2) // { //
	 * System.out.println("prime"); // } // else { //
	 * System.out.println("not prime"); // }
	 */	
	
	
	/*
	 * // int num = 12; // int count = 0; // for(int i = 1;i<num;i++) // { //
	 * if(i*(i+1)==num) // { // count++; // break; // } // } // if(count>0) // { //
	 * System.out.println("pronic"); // } // else { //
	 * System.out.println("not pronic"); // }
	 */}
}
