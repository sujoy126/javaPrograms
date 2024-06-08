package com.kphbQsp;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=145,sum=0,no1=no;
		
		while(no>0) {
			int rem=no%10;
			
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact=fact*i;
			}
			sum=sum+fact;
			no=no/10;
		}
		if(no1==sum) {
			System.out.println("Strong");
		}else {
			System.out.println("Not a Strong");
		}

	}

}
