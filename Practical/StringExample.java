package com;

public class StringExample {

	public static void main(String[] args) {
		
		String s = "Pallavi"; //creating string using literals
		String s1 = "Pallavi";
		System.out.println(s);
		System.out.println(s1);
		//or
		char [] arr = {'p','a','l','l','a','v','i'};
		String s2 = new String(arr); //converting char array to string
		System.out.println(s2);
		//or
		String s3 = new String("Anudip"); //creating string using new keyword
		String s4 = new String("Anudip");
		System.out.println(s3);
		System.out.println(s4);

	}

}
