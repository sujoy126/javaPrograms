package com.Neelima;

public class StringLarge {
public static void main(String[] args) {
	String str = "hello i am in Qspiders";
	  String s[]= str.split(" ");
	  String sr = "";
	  for(int i = 0;i<s.length;i++)
	  {
		  if(s[i].length()>sr.length()) {
			  sr = s[i];
		  }
	  }
	  System.out.println(sr);
}
}
