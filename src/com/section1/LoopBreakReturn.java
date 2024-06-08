package com.section1;

public class LoopBreakReturn {
	public static void main(String[] args) {
		
		//break
		for(int i=0; i<=10; i++) {
			if(i==5) {
				break;
				
			}
			System.out.println(i);
			
		}
		System.out.println("--------------------");
		//return
				for(int i=0; i<=10; i++) {
					if(i==5) {
						System.out.println(i);
						return;
						
					}
					
				}
		
	}

}
