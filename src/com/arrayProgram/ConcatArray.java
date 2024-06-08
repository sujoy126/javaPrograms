package com.arrayProgram;

import java.util.Arrays;

public class ConcatArray {
	public static void main(String[] args) {
		int ary1[] = {1,2,3,4,5};
		int ary2[] = {6,7,8,9,10};
		
		int newArray[] = Arrays.copyOf(ary1, ary1.length+ary2.length);
		System.arraycopy(ary2, 0, newArray, ary1.length, ary2.length);
		
		System.out.println("Total Array : "+ Arrays.toString(newArray));
		
				
	}

}
