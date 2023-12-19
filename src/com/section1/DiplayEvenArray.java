package com.section1;

import java.util.Scanner;

public class DiplayEvenArray {
	public static void main(String[] args) {
		int ary[]= new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide input");
		for(int i=0; i<ary.length; i++) {
			ary[i]= sc.nextInt();
			
		}
		for(int j=0; j<ary.length; j++) {
			if(ary[j]%2==0) {
				System.out.println("This is Even number "+ary[j]);
			}
		}
		
	}

}
