package com.kphbQsp;

import java.util.Scanner;

public class AddProgramWithoutElse {
	public static String add(int a, int b, int c) {
		if(a>b && a>c) {
			return a+" is greatest number";
		}
		else if(b>c)
			return b+" is greatest number";
		return c+" is greatest number";
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("provide number");
		
		System.out.println(add(sc.nextInt(),sc.nextInt(),sc.nextInt()));
		
	}
}
