package com;

//superclass
class Animal{
	String food;
	String color;
	String place;
	String type;
	String name;
	
	public void eat() {
		System.out.println(" I am eating");
	}
}

//subclass,inherit from Animal
class Dog extends Animal{
	
	String bread="Labrador"; //child class property
	
	void display() {
		System.out.println("food is : " + food);
		System.out.println("color is: " + color);
		System.out.println("place is : " + place);
		System.out.println("type is : " + type);
		System.out.println("name is :" + name);
		System.out.println("bread is : " + bread);
	}	
	
}

public class InheritanceExample {

	public static void main(String[] args) {
		Dog d = new Dog(); //creating object
		d.food ="meat/milk"; //access field of superclass
		d.color="white";
		d.place="Doghouse";
		d.type="petanimal";
		d.name="puppy";
		
        d.display(); //calling subclass method
        d.eat(); // calling mainclass method
	}

}
