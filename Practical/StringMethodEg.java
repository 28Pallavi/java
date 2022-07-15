package com;

public class StringMethodEg {

	public static void main(String[] args) {
		
		//methods of String class
		String s = "Pallavi Humbad";
		System.out.println(s.toUpperCase()); //PALLAVI HUMBAD
		//System.out.println(s.toLowerCase()); //pallavi humbad
		System.out.println(s.startsWith("Pa")); //true
		System.out.println(s.endsWith("da"));  //false
		System.out.println(s.length()); //14
		String rs = s.replace("Humbad", "Patil");
		System.out.println(rs); //Pallavi Patil
		String s1 = "NehaVanje";
		String s2 = "Vanje";
		String s3 = "nehavanje";
		System.out.println(s1.equals(s2)); //false
		System.out.println(s1.equals(s3)); //false
		System.out.println(s1.equalsIgnoreCase(s3)); //true
		System.out.println(s1.compareToIgnoreCase(s3)); //0
		System.out.println(s1.compareTo(s2)); //positive
		System.out.println(s2.compareTo(s1)); //negative
		System.out.println(s2.concat(" Neha"));
		System.out.println(s2.concat(s1)); //vanjeNehavanje
		String s4 = "have a nice day";
		System.out.println(s4.contains("nice")); //true
		System.out.println();
		String [] arr = s4.split("\\s"); ////split on whitespace
		for(String a: arr) {
			System.out.println(a);
		}
		System.out.println(s4.substring(2));
		System.out.println(s4.substring(0, 10));
		
		

	}
}
