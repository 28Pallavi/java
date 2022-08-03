package CollectionEg;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> al = new LinkedHashSet<String>();
		
		al.add("Pallavi");
		al.add("Neha");
		al.add("Mamta");
		al.add("shivshakti");
		al.add("Pallavi"); //cannot take duplicate value
		al.add("pooja");
		al.add("Priya");
		al.add("shivlila"); 
		al.add("madhavi");  
		al.add(null);  // allows null values
		
		//traversing using iterator
		Iterator <String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
