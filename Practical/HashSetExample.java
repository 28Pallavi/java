package CollectionEg;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet <String> al = new HashSet<String>();

		al.add("Pallavi");
		al.add("Neha");
		al.add("Mamta");
		al.add("shivshakti");
		al.add("Pallavi"); //cannot take duplicate value
		al.add("pooja");
		al.add("Priya");
		al.add(null);  // allows null values
		
		//traversing using iterator
		Iterator <String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		al.remove(2);
		System.out.println("\nAfter removing");
		Iterator <String> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		
	}

}
