package com.arrayProgram;

import java.util.Arrays;

import java.util.Collections;

public class SortingArray {
	public static void main(String[] args) {
		Object ary[]= {10,2,6,90,3,56};
		Arrays.sort(ary);
		String ar = Arrays.toString(ary);
		System.out.println(ar);
		
		Arrays.sort(ary, Collections.reverseOrder());
		System.out.println(Arrays.toString(ary));
	}

}
