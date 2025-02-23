package com.manjeet.string;

import java.util.Arrays;
import java.util.List;

public class StringBuilderExample {
	private static String s="Hello World !!";
	
	public static void main(String[] args) {
		StringBuilder sb =new  StringBuilder(s);
		//sb.append(s);
		sb.reverse();
		System.out.println("reverse string by StringBuilder :: "+sb);
		
		/*
		 * List<StringBuilder> asList = Arrays.asList(sb);
		 * 
		 * for(StringBuilder s1:asList) { System.out.println("s1 :: "+s1); }
		 */
		
	}
}
