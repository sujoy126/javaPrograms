package com.section1;

public class AllPrimeNumbers {
	public static void main(String[] args) {
		 for (int i = 2; i <= 100; i++) {
	        //   boolean isPrime = true;
                int j;
	            for ( j = 2; j < i; j++) {
	                if (i % j == 0) {
	                //    isPrime = false;
	                	
	                    break;
	                }
	            }

	            if (i==j) {
	                System.out.println(i);
	            }
	            
	        }
		
	}

}
