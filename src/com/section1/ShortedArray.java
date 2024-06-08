package com.section1;

public class ShortedArray {
	public static void main(String[] args) {
		int ary[]= {0,1,4,10,33,9,5};
		for(int i=0; i<ary.length; i++) {
			for(int j=1; j<ary.length;j++) {
				if(ary[i]> ary[j] && i>j) {
					break;
				}
				if(ary[i]==ary[j]) {
					System.out.println(ary[i]+"");
				}
			}
		}
	}

}
