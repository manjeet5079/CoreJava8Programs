package com.manjeet.string;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.IntStream;

public class StringTest {
 
	
	public static void main(String[] args) {
		String s="hello String welcome";
		char charAt;
		char[] chars = s.toCharArray();
		for(int i=0; i<chars.length;i++) {
			for(int j=i+1;j<chars.length;j++) {
				if(chars[i]==chars[j]) {
					System.out.print(chars[i]+" ");
					break;
				}
			}
		}
		for(int i=0; i<s.length();i++) {
			 charAt = s.charAt(i);
			System.out.println("charAt:"+charAt);
		}
		
		
		StringBuilder sb =new  StringBuilder(s);
		//sb.append(s);
		sb.reverse();
		System.out.println("reverse string by StringBuilder :: "+sb);
		
		List<String> asList = Arrays.asList(s);
		
		for(String s1:asList) {
			System.out.println("s1 :: "+s1);
		}
		
		StringBuffer sb1=new StringBuffer(s);
		sb1.reverse();
		System.out.println("reverse by StringBuffer:: "+sb1);
		
		String string = new StringBuffer(s).reverse().toString();
		System.out.println("reverse byStringBuffer :: "+string);
		
		String string2 = new StringBuilder().append(s).reverse().toString();
		System.out.println("reverse string by StringBuilder :: "+string2);
		
		
	}
	
}
