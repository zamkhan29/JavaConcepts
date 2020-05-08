package com.strings;

public class ReverseString {
	public static void main(String[] args) {

		String str="Banaglore";
		System.out.println("before rev:"+str);
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
		
		 rev=rev+str.charAt(i);	
		 System.out.println(rev);
		}
		System.out.println("after:"+rev);
	}
} 
