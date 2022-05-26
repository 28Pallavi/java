package com;

public class ObjectExample {
	
	int id;
	String name;
	String dept="CS";

	public static void main(String[] args) {
		
		ObjectExample obj = new ObjectExample();
		ObjectExample obj1 = new ObjectExample();
		
		obj.id=100;
		obj.name="Pallavi";
		
		obj1.id=102;
		obj1.name="Neha";
		
		System.out.println(obj.id + " " + obj.name + " " +obj.dept);
		System.out.println(obj1.id + " " + obj1.name + " " +obj.dept);
		

	}

}
