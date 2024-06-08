package com.section1;

public class UpercaseOrLowercase {
	public static void main(String[] args) {
		char ch = '%';
		if(ch>='A' && ch<='Z') {
			System.out.println(ch+" uppercase");
		}
		else if(ch>='a'&& ch<='z'){
			System.out.println(ch+" lowercase");
		}
		else {
		System.out.println(ch+" is not a Alphabet");
		}
	}

}
