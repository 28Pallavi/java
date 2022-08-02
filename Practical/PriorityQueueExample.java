package CollectionEg;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
	
		PriorityQueue<String> al=new PriorityQueue<String>();
		
		al.add("Pallavi");
		al.add("Neha");
		al.add("Mamta");
		al.add("shivshakti");
		al.add("pooja");
		al.add("Priya");
		
		System.out.println("Peek element: " + al.peek()); //alphabetically first element
		
		//traversing using iterator
		Iterator <String> itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		al.remove();
		System.out.println("\nAfter removing");
		Iterator <String> itr1 = al.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}

}
