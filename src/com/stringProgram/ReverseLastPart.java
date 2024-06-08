package com.stringProgram;

public class ReverseLastPart {
	public static void main(String[] args) {
		String str ="last month count";
		String st[]= str.split(" ");
		String rev1 = "";
		String rev2 = "";
		for(int i=0; i<st.length; i++) {
			
			String r = st[i];
			if(i==st.length-1) {
				for(int j=r.length()-1;j>=0; j--) {
					rev2 = rev2+ r.charAt(j);
				}
			}
			else
				rev1 = rev1 +" "+ st[i];
		}
		System.out.println(rev1+" "+rev2);
	}

}
