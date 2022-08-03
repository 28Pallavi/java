package CollectionEg;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		
		TreeSet<String> al = new TreeSet<String>();
		
		al.add("Pallavi");
		al.add("Neha");
		al.add("Mamta");
		al.add("shivshakti");
		al.add("Pallavi"); //cannot take duplicate value
		al.add("pooja");
		al.add("Priya");
		al.add("shivlila"); 
		al.add("madhavi");  
		
		//traversing using iterator
		Iterator <String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
