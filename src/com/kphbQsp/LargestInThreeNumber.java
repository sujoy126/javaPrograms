package com.kphbQsp;

import java.util.Scanner;

public class LargestInThreeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide any integer num");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is maximum number");
		}
		else if(num2>num3 && num2>num1) {
			System.out.println(num2+" is maximum number");
		}
		else
			System.out.println(num3+" is maximum number");
	}

}
