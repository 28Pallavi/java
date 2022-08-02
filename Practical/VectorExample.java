package CollectionEg;

import java.util.Iterator;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector <String> al = new Vector <String>();
		
		al.add("Pallavi");
		al.add("Neha");
		al.add("Mamta");
		al.add("shivshakti");
		al.add(1,"shivani"); //get added at specific of list
		al.add("pooja");
		al.add("Priya");
		
		//traversing using iterator
		Iterator <String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
