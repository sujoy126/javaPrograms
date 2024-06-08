package com.stringProgram;

public class StringTaggle {
	public static void main(String[] args) {
		String str = "TiGEr";
		String s = "";
		for(int i=0; i<str.length(); i++) {
			char st = str.charAt(i);
			if(Character.isUpperCase(st)==true) {
				st = Character.toLowerCase(st);
				s = s + st;
			}
			else {
				st = Character.toUpperCase(st);
					s= s+st;
				}
			}
		System.out.println(s);
		}
	}


