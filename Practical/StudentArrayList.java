package CollectionEg;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArrayList {

	public static void main(String[] args) {
	
		//creating object of Student
		Student s= new Student(1,"pallavi",98765432);
		Student s1= new Student(2,"shivshakti",91765432);
		Student s2= new Student(3,"pooja",8765432);
		Student s3= new Student(4,"neha",8965432);
		Student s4= new Student(5,"shivani",88765432);
		
		//creating ArrayList of Student datatype
		ArrayList<Student> a = new ArrayList<Student>();
		
		//adding Student object
		a.add(s);
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		
		System.out.println("Student List");
		Iterator<Student> itr = a.iterator(); //get iterator
		
		//traversing element of list
		while(itr.hasNext()) {
			Student st=itr.next(); //printing list until next element
			System.out.println(st.sid + " "+ st.sname+ " "+ st.sphone);
		}

		a.remove(4); //remove element list
		System.out.println("Student list after removing");
		Iterator<Student> itr1 = a.iterator(); //get iterator
		
		//traversing element of list
		while(itr1.hasNext()) {
			Student st=itr1.next(); //printing list until next element
			System.out.println(st.sid + " "+ st.sname+ " "+ st.sphone);
		}
	}

}
