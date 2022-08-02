package CollectionEg;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>(); //creating arrayList
		
		//adding object in list
		al.add("Pallavi");
		al.add("Pooja");
		al.add("Mamta");
		al.add("shishakti");
		al.add(1, "madhavi"); //adding object in list with index value
		al.add("Neha");
		al.add("shivani");
		
		System.out.println(al); //printing list object
		System.out.println(al.size()); //print length of list
		
		al.add("kubra");
		al.add("chadana");
		
		al.remove(2); //removing elements on specified index 
		
		System.out.println(al); //printing list object
		System.out.println(al.size()); //print length of list
		
		//traversing list using iterator
		Iterator<String> itr = al.iterator(); //get iterator
		while(itr.hasNext()) { //check if iterator 
			System.out.println(itr.next()); //printing list
		}
		
		System.out.println("traversing using loop");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}

		System.out.println("traversing using for each loop");
		for(String a : al) {
			System.out.println(a);
		}
	}

}
