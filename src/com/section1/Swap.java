package com.section1;

public class Swap {
public static void main(String[] args) {
	int c;
	int a=8;
	int b=4;
	System.out.println("before sswap"+a);
	System.out.println("before sswap"+b);
	
c=a;	
a=b;
b=c;	
	System.out.println("after sswap"+a);
	System.out.println("after sswap"+b);

// another logic
	int p= 5;
	int q= 3;
	
	p= p+q;
	q= p-q;
	p= p-q;
	System.out.println("p "+p);
	System.out.println("q "+q);
	
}


}
