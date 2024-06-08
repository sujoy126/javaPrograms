package com.patterns;

public class SquresHollow {
	public static void main(String[] args) {
		 int n = 11; // Size of the square
	        for (int i = 1; i <= n; i++) { // Loop for rows
	            for (int j = 1; j <= n; j++) { // Loop for columns
	                // Checking conditions for printing asterisk or space
	                if (i == 1 || i == n || j == 1 || j == n)  { // For edges or corners
	                    System.out.print("* "); // Print asterisk
	                } else {
	                    System.out.print(" "); // Print space
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	    }

}
