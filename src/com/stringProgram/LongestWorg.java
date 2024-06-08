package com.stringProgram;

import java.util.Scanner;

public class LongestWorg {
	public static void main(String[] args) {
		
        int max_len=0,len=0;
        String w="",max_word="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String st=sc.nextLine();
        st=st.trim();
        st=st+' ';
        for(int i=0;i<st.length();i++)
        {
                        char x=st.charAt(i);
                        if(x!=' ')
                               w=w+x;       
                        else
                        {
                              len=w.length();
             if(len>max_len) 
             {
                                        max_word=w;
                                        max_len=len;
                              }
                             w="";
                        }
        }
        System.out.println("The longest word : "+max_word+" The length of word: "+ max_len);
	}

}
