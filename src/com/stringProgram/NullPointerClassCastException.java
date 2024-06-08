package com.stringProgram;

import java.util.Arrays;

public class NullPointerClassCastException {
	public static void main(String[] args) {
		String str =null;
		try {
			System.out.println(str.length());
		} catch (Exception e) {
			System.out.println("Null pointer Exception Handle");
		}
		
     // ClassCastException
		Object[] ary = {1,2,3,9,5,99,'A'};
		Arrays.sort(ary);
		System.out.println(Arrays.toString(ary));
		
	}

}
