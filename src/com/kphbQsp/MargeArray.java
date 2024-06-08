package com.kphbQsp;

import java.util.Arrays;

public class MargeArray {
	 public static void main(String[] args) {
	        int[] array1 = {1, 2, 3, 4, 5};
	        int[] array2 = {6, 7, 8, 9, 10};
	        
	        // Merge arrays directly in the main method
	        int[] mergedArray = Arrays.copyOf(array1, array1.length + array2.length);
	        System.arraycopy(array2, 0, mergedArray, array1.length, array2.length);
	        
	        // Print the merged array
	        for (int num : mergedArray) {
	            System.out.print(num + " ");
	        }
	    }

}
