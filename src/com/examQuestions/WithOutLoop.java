package com.examQuestions;

public class WithOutLoop {
	
	public static void noloop(int i) {
		if(i<=10) {
			System.out.println(i);
			noloop(i+1);
		}
	}
	public static void main(String[] args) {
		noloop(1);
	}

}
