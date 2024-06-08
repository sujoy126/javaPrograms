package com.kphbQsp;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		 String str1 = "listen";
	        String str2 = "silent";
	        
	        // Check if the strings are anagrams
	        boolean areAnagrams = true;
	        
	        if (str1.length() != str2.length()) {
	            areAnagrams = false;
	        } 
	        else {
	            char[] charArray1 = str1.toCharArray();
	            char[] charArray2 = str2.toCharArray();
	            
	            Arrays.sort(charArray1);
	            Arrays.sort(charArray2);
	            
	            areAnagrams = Arrays.equals(charArray1, charArray2);
	        }
	        
	        // Print the result
	        if (areAnagrams) {
	            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are anagrams.");
	        } else {
	            System.out.println("The strings '" + str1 + "' and '" + str2 + "' are not anagrams.");
	        }
	    }
	}


