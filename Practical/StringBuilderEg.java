package com;

public class StringBuilderEg {

	public static void main(String[] args) {
		StringBuilder s= new StringBuilder("Pallavi");  //creating object of StringBuilder class
		s.append(" Humbad");  //changes string s
		System.out.println(s);  //Pallavi Humbad 
		
		s.insert(0, "Miss ");  //inserting string at given position
		System.out.println(s);
		
		s.replace(0,3,"Name");  //replacing string with respective index & how many char replace
		System.out.println(s);
		
		s.delete(0, 3);  //delete string from start to end position
		System.out.println(s);
		
		s.reverse();  //reverse string
		System.out.println(s);

	}

}
