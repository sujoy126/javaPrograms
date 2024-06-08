package com.section1;

public class AAskiVslue {
	public static void main(String[] args) {
		String s = "AaBbOo";
		char ch[] = s.toCharArray();
		for(int a : ch) {
			System.out.println(a);
		}
		
		System.out.println("--------");
		char c = 'A';
		int b = c;
		System.out.println(b);
		System.out.println("-------------------------");
		
		
		int i=10;
		String sp = String.valueOf(i);
		System.out.println(sp);
	}
}

