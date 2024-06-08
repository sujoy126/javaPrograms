package com.section1;

import java.util.Scanner;

public class Primenumber11 {
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		System.out.println("provide number");
		int num = sc.nextInt();
		
		for(int i=2; i*i<=num; i++) {
			if(num%i==0) {
				System.out.println(num+" is not a prime number");
				return;
			}
		}
		System.out.println(num+" is a prime number");
	}

}
