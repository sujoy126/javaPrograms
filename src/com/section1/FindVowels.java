package com.section1;

import java.util.Scanner;

public class FindVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Type any Words: ");
		 String s = sc.nextLine();
		int ip = s.length();
		for(int i=0; i<ip; i++) {
			char ch =s.charAt(i);
			if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'|| ch=='A'|| ch=='E'||ch=='I'|| ch=='O'|| ch=='U') {
				System.out.println("Vowels are : "+ch);
			}
		}
	}

}
