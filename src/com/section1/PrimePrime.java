package com.section1;

import java.util.Scanner;

public class PrimePrime {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter num");
        
		int num = s.nextInt();
		for (int i = 2; i * i <= num; i++) {
			if (num % i == 0) {
				System.out.println("Not Prime");
				return;
			}
		}
		System.out.println("Prime");
	}

}
