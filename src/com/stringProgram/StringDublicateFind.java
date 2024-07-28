package com.stringProgram;

import java.util.HashSet;
import java.util.Set;

public class StringDublicateFind {
	public static void main(String[] args) {
		String str = "we are indian we can do it it";
		String st[]= str.split(" ");
		
		Set<String> uniqueS = new HashSet<>();
		Set<String> dublicateS = new HashSet<>();
		for(String s: st) {
			if(!uniqueS.add(s)) {
				dublicateS.add(s);
			}
		}
		
		System.out.println("Dublicate String is : "+dublicateS );
		
		}
	}


