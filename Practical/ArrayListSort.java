package CollectionEg;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		
		ArrayList<String> al= new ArrayList<String>(); //creating arrayList
		
		al.add("Pallavi");
		al.add("Pooja");
		al.add("Mamta");
		al.add("shishakti");
		al.add("Neha");
		al.add("shivani");
		
		System.out.println("before sorting");
		for(String a : al) {
			System.out.println(a);
		}
		
		Collections.sort(al); //sort list
		
		System.out.println("after sorting");
		for(String a : al) {
			System.out.println(a);
		}
		
		System.out.println("--------------");
		ArrayList<Integer> all= new ArrayList<Integer>(); //creating arrayList
		
		all.add(101);
		all.add(103);
		all.add(102);
		all.add(105);
		all.add(107);
		all.add(106);
		
		System.out.println("before sorting");
		for(Integer a : all) {
			System.out.println(a);
		}
		
		Collections.sort(all); //sort list
		
		System.out.println("after sorting");
		for(Integer a : all) {
			System.out.println(a);
		}
		

	}

}
