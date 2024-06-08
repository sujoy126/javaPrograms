package com.patterns;

public class ButterflyPattern {
	public static void main(String[] args) {
		for(int i=1; i<=7; i++) {
			for(int j=1; j<=7; j++) {
				if((i==4 || i+j==8|| i==j|| j==1|| j==7)||((i==3||i==5)&&(j==2||j==6))) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
