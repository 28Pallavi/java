package com;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexEg {

	public static void main(String[] args) {
		
		Pattern p = Pattern.compile("..m");  //.-single character
		Matcher m = p.matcher("madam");
		boolean b = m.matches();
		System.out.println(b);
		
		//or
		boolean b1 = Pattern.compile("s.").matcher("so").matches();
		System.out.println(b1);
		
		//or
		boolean b2 = Pattern.matches("..c.", "much");
		System.out.println(b2);
		
		//or
		System.out.println(Pattern.matches("..c.", "much"));
		
		System.out.println(Pattern.matches("[a-zA-Z]{5}","Mamta"));
		
		System.out.println(Pattern.matches("[a-zA-Z]{5}","Mamta12"));
		
		System.out.println(Pattern.matches("[a-zA-Z]{5}","MamtaTAD"));
		
		System.out.println(Pattern.matches("[a-zA-Z]{5}","taTAD"));
		
		System.out.println(Pattern.matches("[a-zA-Z]{8,}","MamtA1234"));
		
		System.out.println("Mobile Phone : "  + Pattern.matches("[6789]{1}[0-9]{9}","1234567890"));
		
		System.out.println("Mobile Phone : "  + Pattern.matches("[6789]{1}[0-9]{9}","9234567890"));
		
		System.out.println("Email : " + Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}","mamta12@gmail.com"));
		
	}

}
