package com.patterns;

public class RectengalPatterns {
	public static void main(String[] args) {
		int n =9;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(  // j==1 && i!=1 && i!=n 
////				   || i==n && j!=1 && j!=n
////				   || i==1 && j!=1 && j!=n
////				   || j==n && i!=1 && i!=n
						
				(j == 1 || j == n) && (i == 1 || i == n) // For corners
                 || (i > 1 && i < n) && (j == 1 || j == n)
				   )
				{    
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
