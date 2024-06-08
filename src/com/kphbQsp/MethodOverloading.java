package com.kphbQsp;

public class MethodOverloading {
	public static void add(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}
public static void add(double a, double b) {
	double sum = a+b;
	System.out.println(sum);
	}
public static void add(int a, char b) {
	int sum = a+b;
	System.out.println(sum);
}
public static void add(long a, long b) {
	long sum = a+b;
	System.out.println(sum);
}
public static void add(int a, double b) {
	double sum = a+b;
	System.out.println(sum);
}


public static void main(String[] args) {
	add(2, 3);
	add(3, 'a');
	add(400.9, 100.1);
	add(3, 3.3);
	
}
	
	

}
