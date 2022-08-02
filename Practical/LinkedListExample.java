package CollectionEg;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList <String> al = new LinkedList <String>();
		
		al.add("Pallavi");
		al.add("Neha");
		al.add("Mamta");
		al.add("shivshakti");
		al.add(1,"shivani"); //get added at specific of list
		al.add("pooja");
		al.add("Priya");
		al.addFirst("shivlila"); //get added at beginning of list
		al.addLast("madhavi");  //get added at end of list
		
		//traversing using iterator
		Iterator <String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		al.remove(4); //remove element at specific index
		
		//traversing using list iterator
		ListIterator <String> itr1= al.listIterator();
		
		System.out.println("Forward Direction");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

		System.out.println("Backword Direction");
		while(itr1.hasPrevious()) {
			System.out.println(itr1.previous());
		}
	}

}
