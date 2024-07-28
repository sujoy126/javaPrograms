package com.arrayProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ThirdMaximum {
	public static void main(String[] args) {
		int arr[]= {7,7,4,4,2,9,6,5};
		Set<Integer> s=new HashSet<Integer>();
		for (Integer i : arr) {
			s.add(i);
		}
		System.out.println(s);
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.addAll(s);
		System.out.println(al);
		System.out.println(al.get(al.size()-3));
	}

}
