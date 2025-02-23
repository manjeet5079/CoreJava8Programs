package com.manjeet.string;

public class TestString {

	public static void main(String[] args) {
		
		String s="Welcome";
		char ch;
		String ss="";
		for(int i=0;i< s.length(); i++) {
			 ch = s.charAt(i);
			 ss = ch+ss;
		}
		System.out.println("reverse String by for loop :: "+ss);
		
		String reverse="";
		for(int i=s.length()-1; i>=0;i--) {
			reverse=reverse+s.charAt(i);
		}
		
		System.out.println("reverse String by for loop ::"+reverse);
		
		
		String reverseString = new StringBuffer(s).reverse().toString();
		System.out.println("reverseString by StringBuffer :: "+reverseString);
		
		String reverseString1 = new StringBuilder(s).reverse().toString();
		System.out.println("reverseString1 by StringBuilder :: "+reverseString1);
		
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		sb.reverse();
		System.out.println(sb);
	}
}
